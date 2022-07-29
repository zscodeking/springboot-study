package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @RequestMapping(value = "/each/list")
    public String eachList(Model model){
        List<User> userList = new ArrayList<User>();
        for (int i = 0;i < 10;i++){
            User user = new User();
            user.setId(100 + i);
            user.setNick("张" + i);
            user.setPhone("1361234567" + i);
            user.setAddress("北京市大兴区" + i);
            userList.add(user);
        }
        model.addAttribute("userList",userList);
        return "eachList";
    }
    @RequestMapping(value = "/each/map")
    public String eachMap(Model model) {
        Map<Integer,Object> userMaps = new HashMap<Integer, Object>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setNick("李四"+i);
            user.setPhone("1390000000"+i);
            user.setAddress("天津市"+i);
            userMaps.put(i,user);
        }
        model.addAttribute("userMaps",userMaps);
        return "eachMap";
    }
    @RequestMapping(value = "/each/array")
    public String eachArray(Model model) {
        User[] userArray = new User[10];
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setNick("赵六"+i);
            user.setPhone("1380000000"+i);
            user.setAddress("深圳市"+i);
            userArray[i] = user;
        }
        model.addAttribute("userArray",userArray);
        return "eachArray";
    }
    @RequestMapping(value = "/each/all")
    public String eachAll(Model model) {
        //list -> Map -> List -> User
        List<Map<Integer,List<User>>> myList = new ArrayList<Map<Integer, List<User>>>();
        for (int i = 0; i < 2; i++) {
            Map<Integer,List<User>> myMap = new HashMap<Integer, List<User>>();
            for (int j = 0; j < 2; j++) {
                List<User> myUserList = new ArrayList<User>();
                for (int k = 0; k < 3; k++) {
                    User user = new User();
                    user.setId(k);
                    user.setNick("张三"+k);
                    user.setPhone("1350000000"+k);
                    user.setAddress("广州市"+i);
                    myUserList.add(user);
                }
                myMap.put(j,myUserList);
            }
            myList.add(myMap);
        }
        model.addAttribute("myList",myList);
        return "eachAll"; }
}
