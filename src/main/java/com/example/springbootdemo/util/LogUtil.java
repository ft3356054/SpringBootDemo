package com.example.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("log")
public class LogUtil {
    public static final Logger daoLog = LoggerFactory.getLogger("daoLog");
    public static final Logger redisLog = LoggerFactory.getLogger("redisLog");
}
