package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @RequestMapping(value = "/student")
    public  Object Student(){
        Student student = new Student();
        student.setId(1001);
        student.setName("zhangsan");
        return student;
    }

    @RequestMapping(value = "queryStudentById",method = {RequestMethod.GET,RequestMethod.POST})
    public Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;
    }

    //@RequestMapping(value = "queryStudentById2",method = RequestMethod.GET)
    @GetMapping(value = "/queryStudentById2")
    //该注解通常在查询数据的时候使用 -> 查询
    public Object queryStudentById2(){
        return "Hello World!";
    }

    //@RequestMapping(value = "/insert",method = RequestMethod.POST)
    @PostMapping(value = "/insert")
    //该注解通过常新增数据的时候使用 -> 新增
    public Object insert(){
        return "Insert successfully!";
    }

    //@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @DeleteMapping(value = "/delete")
    //该注解通常在删除数据的时候使用 -> 删除
    public Object delete(){
        return "delete Student!";
    }

    //@RequestMapping(value = "/update",method = RequestMethod.PUT)
    @PutMapping(value = "/update")
    //该注解通常在修改数据的时候使用 -> 更新
    public Object update(){
        return "update student info";
    }
}
