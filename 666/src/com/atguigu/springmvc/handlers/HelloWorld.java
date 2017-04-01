package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hp on 2017/3/21.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "success";
    }
}
