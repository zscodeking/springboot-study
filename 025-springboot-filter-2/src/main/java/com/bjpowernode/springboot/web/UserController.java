package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public @ResponseBody String Userdetail(){

        return "/user/detail";
    }

    @RequestMapping(value = "/center")
    public @ResponseBody String center(){

        return "center";
    }
}
