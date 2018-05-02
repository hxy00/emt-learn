package com.emt.controller;

import com.emt.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mr.Huang
 * @Date: 2018-04-19
 * @Description:
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name){
        return schedualServiceHi.sayHello(name);
    }

}
