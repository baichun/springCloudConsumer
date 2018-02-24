package com.uxun.bc.spring.controller;

import com.uxun.bc.spring.entity.User;
import com.uxun.bc.spring.service.IFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 欧阳爱东 on 2018/2/8.
 */
@RestController
@RequestMapping("/test")
public class FeignTestController {

    @Value("${name}")
    String name;

    @Autowired
    private IFeginService feginService;

    @RequestMapping(value = "/hello")
    public String sayHello(){
        String result = feginService.sayHello();
        System.out.println("===========result============="+result);


        return feginService.sayHello();
    }

    @RequestMapping(value = "/helloTo")
    public String sayHelloTo(){
        // String name = "baichun";
        System.out.println("========name=========="+name);
        String result1 = feginService.sayHelloTo(name);
        System.out.println("===========result============="+result1);

        return feginService.sayHelloTo(name);
    }

    @RequestMapping(value = "/helloToUser")
    public String sayHelloToUser(){
        // String name = "baichun";
        User user = new User();
        user.setUserName("张三");
        user.setAge(23);
        user.setSex("f");
        user.setUserId(10001);
        User result1 = feginService.sayHelloToUser(user);
        System.out.println("===========result============="+result1.getDesc());

        return "This is "+result1.getUserName()+"," + result1.getDesc();
    }
}
