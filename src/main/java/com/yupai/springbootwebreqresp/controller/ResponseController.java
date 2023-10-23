package com.yupai.springbootwebreqresp.controller;

import com.yupai.springbootwebreqresp.pojo.Address;
import com.yupai.springbootwebreqresp.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {
    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("Hello~");
        //return "Hello~";
        return Result.success("Hello~");
    }

    @RequestMapping("getAddr")
    public Result getAddr(){
        Address addr = new Address();
        addr.setProvince("zhejiang");
        addr.setCity("hangzhou");
        System.out.println(addr);
        //return addr;
        return Result.success( addr );
    }

    @RequestMapping("/listAddr")
    public Result listAddr(){
        Address addr1 = new Address();
        Address addr2 = new Address();
        addr1.setProvince("zhejiang");
        addr1.setCity("hangzhou");
        addr2.setProvince("jiangsu");
        addr2.setCity("nanjing");
        List<Address> addrList = new ArrayList<>();
        addrList.add(addr1);
        addrList.add(addr2);
        System.out.println(addrList);
        //return addrList;
        return Result.success(addrList);
    }
}
