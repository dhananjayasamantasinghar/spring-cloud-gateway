package com.springcloudgatewayservice;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.Route.AsyncBuilder;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableHystrix
@Configuration
public class GatewayConfig {

	@Value("${api.uri}")
	private String uri;
	
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(configureRoute("/allCountries", "countries-service", "forward:/countriesfallback"))
                .route(configureRoute("/allFruits", "fruit-service", "forward:/fruitfallback"))
                .build();
    }
	
	private Function<PredicateSpec, AsyncBuilder> configureRoute(String path ,String serviceName, String fallBackUri) {
		return request -> request
		        .path(path)
		        .filters(filter ->
		                 filter.hystrix(config -> config.setName(serviceName)
		                 .setFallbackUri(fallBackUri))
		        )
		        .uri(uri);
	}
}
