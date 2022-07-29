package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/put")
    public @ResponseBody
    Object put(String key, String value) {

        studentService.put(key, value);

        return "值已成功放入Redis";
    }

    @RequestMapping(value = "/get")
    public @ResponseBody
    String get() {

        String count = studentService.get("count");
        return "数据count为" + count;
    }
}
