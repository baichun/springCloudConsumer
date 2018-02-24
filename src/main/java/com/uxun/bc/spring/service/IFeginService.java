package com.uxun.bc.spring.service;

import com.uxun.bc.spring.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 欧阳爱东 on 2018/2/8.
 */
@FeignClient(name="eureka-server")
public interface IFeginService {

    @RequestMapping(value="/say/helloTo",method= RequestMethod.GET)
    public String sayHelloTo(@RequestParam("name") String name);

    @RequestMapping(value="/say/hello",method= RequestMethod.GET)
    public String sayHello();

    @RequestMapping(value="/say/helloToUser",method= RequestMethod.POST)
    public User sayHelloToUser(@RequestBody User user);
}
