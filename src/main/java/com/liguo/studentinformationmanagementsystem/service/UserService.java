package com.liguo.studentinformationmanagementsystem.service;

import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.mapper.UserMapper;
import com.liguo.studentinformationmanagementsystem.pojo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
     *
     * @param user
     * @return 返回一个user实体，但是没有密码
     */
    public User userLogin(UserVO user) {
        User user1 = userMapper.selectByUserVO(user);
        return user1;
    }

    public int deleteUserByUsername(String username) {
        return userMapper.deleteByPrimaryKey(username);
    }

    public List<User> selectByUsername(String username) {
        return userMapper.selectByPrimaryKey(username);
    }

    public int updatePrivilege(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    public int insertDataByExcel(List<User> users) {
        return userMapper.insert(users);
    }
}
