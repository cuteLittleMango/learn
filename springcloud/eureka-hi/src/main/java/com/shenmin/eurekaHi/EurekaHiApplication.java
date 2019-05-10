package com.shenmin.eurekaHi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述〈服务提供者〉
 *
 * @author shen.min
 * @create 2019/5/8 13:18
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaHiApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaHiApplication.class, args);
    }

    /*
     获取端口号
    */
    @Value("${server.port}")
    String port;

    /*
    * say hi
    * */
    @GetMapping("/hi/{name}")
    public String home(@PathVariable String name){
        return "hi," + name + ", I am from port " + port;
    }
}