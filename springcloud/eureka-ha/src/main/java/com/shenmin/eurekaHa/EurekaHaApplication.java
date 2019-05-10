package com.shenmin.eurekaHa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述〈eureka高可用集群〉
 *
 * @author shen.min
 * @create 2019/5/9 9:28
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaHaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaHaApplication.class,args);
    }
}