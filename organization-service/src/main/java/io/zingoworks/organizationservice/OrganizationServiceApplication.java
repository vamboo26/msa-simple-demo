package io.zingoworks.organizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients
public class OrganizationServiceApplication {

    public static void main(String[] args) {
        //return ConfigurableApplicationContext class
        SpringApplication.run(OrganizationServiceApplication.class, args);
    }

}
