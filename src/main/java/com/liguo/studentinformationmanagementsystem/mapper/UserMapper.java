package com.liguo.studentinformationmanagementsystem.mapper;

import com.liguo.studentinformationmanagementsystem.entity.User;
import com.liguo.studentinformationmanagementsystem.pojo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    int deleteByPrimaryKey(String username);

    int insert(List<User> users);

    int insertSelective(User record);

    List<User> selectByPrimaryKey(String username);

    User selectByUserVO(UserVO userVO);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}