package com.emt.service;

import com.emt.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Mr.Huang
 * @Date: 2018-04-19
 * @Description:
 */
@FeignClient(value = "emt-server-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}
