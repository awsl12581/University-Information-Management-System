package com.liguo.studentinformationmanagementsystem.mapper;

import com.liguo.studentinformationmanagementsystem.entity.Teacher;
import com.liguo.studentinformationmanagementsystem.pojo.TeacherVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {
    int deleteByPrimaryKey(String teacherId);

    int insert(Teacher record);

    int insert(List<Teacher> teacherList);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    ArrayList<Teacher> selectByTeacher(TeacherVO teacherVO);
}