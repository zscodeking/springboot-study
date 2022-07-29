package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public ModelAndView userDetail(){
        User user = new User();
        user.setId(1001);
        user.setUsername("zhangsan");
        user.setAge(23);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("userDetail");
        mv.addObject("user",user);
        return mv;
    }

    @RequestMapping(value = "/url")
    public String url(Model model){
        model.addAttribute("id",1001);
        model.addAttribute("age",999);
        model.addAttribute("username","zhaoliu");
        return "url";
    }
    @RequestMapping(value = "/test")
    public @ResponseBody String test(String username){

        return "请求路径/test,参数是：" + username;
    }
    @RequestMapping(value = "/test1")
    public @ResponseBody String test1(Integer id,Integer age,String username){
        return "参数id：" +id + "参数age："+age+"参数username："+username;
    }
    @RequestMapping(value = "/test2/{id}")
    public @ResponseBody String test2(@PathVariable("id") Integer id){
        return "ID="+id;
    }

    @RequestMapping(value = "/property")
    public String property(){

        return "property";
    }
}
