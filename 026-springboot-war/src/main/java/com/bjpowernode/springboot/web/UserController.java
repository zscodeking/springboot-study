package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public @ResponseBody Object userdetail(){

        Map<String,Object> reMap = new HashMap<String, Object>();
        reMap.put("id",1001);
        reMap.put("username","lisi");
        return reMap;
    }

    @RequestMapping(value = "/user/page/detail")
    public String userPageDetail(Model model){
        model.addAttribute("id",1001);
        model.addAttribute("username","wangwu");
        return "userDetail";
    }

}
