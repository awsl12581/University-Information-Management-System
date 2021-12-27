package com.liguo.studentinformationmanagementsystem.controller;

/**
 * @author nongChaTea
 * @date 2021/12/26 17:27
 */


import com.liguo.studentinformationmanagementsystem.entity.Course;
import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.pojo.UserVO;
import com.liguo.studentinformationmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test1 {
    @Autowired
    UserService userService;

    @PostMapping("/test")
    public String test(@RequestBody UserVO userVO) throws Exception {
        System.out.println(userVO.toString());
        User user = userService.userLogin(userVO);
        return "WHY"+user;
    }
}
