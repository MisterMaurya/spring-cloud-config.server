# Spring cloud config server

## application.properties

```java
spring.application.name=spring-cloud-config-server-micro
server.port=8888

#Its mandatory if we use local github==>file://
spring.cloud.config.server.git.uri=file://C:/Microservices/git-config

#Other Properties can be use like this
#spring.cloud.config.server.git.uri=https://github.com/MisterMaurya/config
#spring.cloud.config.server.git.username=***********
#spring.cloud.config.server.git.password=**********
#server.port=8888

#To connect with Eureka Client
eureka.client.service-url.default-zone=http://localhost:8761/eureka/

#HIT URL LIKE THIS
#localhost:8888/limit-service/default
#localhost:8888/limit-service/dev
```

## Main Class

```java
// To Enable Config server
@EnableConfigServer
// To Connect With Eureka Server
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerApplication.class, args);
    }
}


```

## pom.xml

```java
<!--TO CREATE CONFIG SERVER-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-config-server</artifactId>
    </dependency>

<!--TO CONNECT WITH DISCOVERY SERVER-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
```
    