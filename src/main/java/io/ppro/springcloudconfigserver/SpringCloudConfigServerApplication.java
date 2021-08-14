package io.ppro.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/***
 * @author Pawan Maurya
 * @since Aug 07, 2021
 */

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
