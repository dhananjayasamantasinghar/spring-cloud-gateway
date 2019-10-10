# Spring Cloud Gateway Example with Hystrix

This example project covers the usage of Spring Cloud Gateway along with Hystrix for circuit breaker functionality

## Dependencies Used
- Spring Boot 2.1.9
- Spring Cloud Gateway
- Spring Cloud Netflix Hystrix
- Spring Cloud Netflix Hystrix Dashboard



## URLs
- `http://localhost:8080/allCountries` - Countries Service
- `http://localhost:8080/allFruits` - Fruit Service
- `http://localhost:8080/actuator/hystrix.stream` - Hystrix Stream endpoint
- `http://localhost:8081/hystrix` - Hystrix Dashboard


- [Countries API](http://localhost:8085/allCountries)
- [Joke API](http://localhost:8085/allFruits)

## References
- [Spring Guide](https://spring.io/guides/gs/gateway/)
- [Spring Cloud Gateway Documentation](https://cloud.spring.io/spring-cloud-gateway/reference/html/#gateway-how-it-works)
