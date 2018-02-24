package com.uxun.bc.spring.service;

import com.uxun.bc.spring.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 欧阳爱东 on 2018/2/8.
 */
@Component
public class FeignFallBack implements IFeginService{

    @Override
    public String sayHelloTo(String name) {
        return name;
    }

    @Override
    public String sayHello() {
        return "============fail===========";
    }

    @Override
    public User sayHelloToUser(User user) {
        user.setDesc("======Error=======");
        return user;
    }
}
