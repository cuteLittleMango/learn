package com.shenmin.serviceFeign.controller;

import com.shenmin.serviceFeign.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述〈消费控制层〉
 *
 * @author shen.min
 * @create 2019/5/9 15:44
 */
@RestController
public class HelloController {

    @Autowired
    private ServiceHi serviceHi;

    /**
     * 调用Feign客户端提供的服务，自带负载均衡
     * @param name
     * @return
     */
    @GetMapping("/hello/{name}")
    public String sayHi(@PathVariable String name){
        //调用Feign客户端ScheduleServiceHi的接口
        return serviceHi.sayHiFromServiceHi2(name);
    }
}