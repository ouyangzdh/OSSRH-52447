package com.shanhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//@EnableEurekaClient
public class ShanhiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShanhiServerApplication.class, args);
    }

}
