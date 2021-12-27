package com.liguo.studentinformationmanagementsystem.controller;

/**
 * @author nongChaTea
 * @date 2021/12/26 17:27
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test1 {

    @GetMapping("/test")
    public String test(@RequestParam String user){
        return "WHY"+user;
    }
}
