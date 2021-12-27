package com.liguo.studentinformationmanagementsystem.service;

import com.liguo.studentinformationmanagementsystem.entity.Student;
import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.mapper.StudentMapper;
import com.liguo.studentinformationmanagementsystem.mapper.UserMapper;
import com.liguo.studentinformationmanagementsystem.pojo.StudentVO;
import com.liguo.studentinformationmanagementsystem.pojo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author nongChaTea
 * @date 2021/12/27 15:00
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    UserMapper userMapper;
    /**
     * 用户登录
     * @param user
     * @return 返回一个user实体，但是没有密码
     */
    public User userLogin(UserVO user){
        User user1 = userMapper.selectByUserVO(user);
        return user1;
    }


}
