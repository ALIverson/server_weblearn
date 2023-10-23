package com.yupai.springbootwebreqresp.controller;

//测试请求参数的接收

import com.yupai.springbootwebreqresp.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {
    //原始方式获取-了解就行了，用不到
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        //获取请求参数
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name+":"+age);
//        return "OK";
//    }
    //springboot方式
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(value = "name",required = false) String name, Integer age){
        System.out.println(name+":"+age);
        return "OK";
    }

    // 实体参数
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }

    //数组参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] array1){
        System.out.println(Arrays.toString(array1));
        return "OK";
    }
    //集合参数
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> array1){
        System.out.println(array1);
        return "OK";
    }

    //json参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    //路径参数
    @RequestMapping("/pathParam/{id}/{name}")
    public String pathParam(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id+"+"+name);
        return  "OK";
    }

}
