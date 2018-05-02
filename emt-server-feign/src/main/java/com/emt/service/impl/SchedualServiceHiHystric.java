package com.emt.service.impl;

import com.emt.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author: Mr.Huang
 * @Date: 2018-04-19
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }

    @Override
    public String sayHello(String name) {
        return "sorry " + name;
    }
}
