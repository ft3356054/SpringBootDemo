package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("fastjson")
class FastJsonController {
    @RequestMapping("/test")
    @ResponseBody
    public User test() {
        User user = new User();

        user.setId("1");
        user.setUserId("jack");
        user.setPwd("jack123");

        // 模拟异常
        int i = 1/0;

        return user;
    }
}
