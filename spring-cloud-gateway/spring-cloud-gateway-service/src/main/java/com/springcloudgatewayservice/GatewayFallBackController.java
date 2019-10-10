package com.springcloudgatewayservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GatewayFallBackController {

    @RequestMapping("/countriesfallback")
    public Mono<String> countries() {
        return Mono.just("Countries API is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/fruitfallback")
    public Mono<String> fruits() {
        return Mono.just("Fruit API is taking too long to respond or is down. Please try again later");
    }
}
