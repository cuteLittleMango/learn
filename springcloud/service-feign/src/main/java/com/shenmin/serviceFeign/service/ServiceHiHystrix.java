package com.shenmin.serviceFeign.service;

import org.springframework.stereotype.Component;

/**
 * 描述〈ServiceHi实现类，远程调用失败后fallback〉
 *
 * @author shen.min
 * @create 2019/5/10 9:18
 */
@Component
public class ServiceHiHystrix implements  ServiceHi {

    @Override
    public String sayHiFromServiceHi2(String name) {
        return "hello" + name +", this message send failed";
    }
}