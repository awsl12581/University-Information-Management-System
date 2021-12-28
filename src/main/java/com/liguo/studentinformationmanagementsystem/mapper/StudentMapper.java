package com.liguo.studentinformationmanagementsystem.mapper;

import com.liguo.studentinformationmanagementsystem.entity.Student;
import com.liguo.studentinformationmanagementsystem.pojo.StudentVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Student record);

    int insert(List<Student> students);

    Student selectByPrimaryKey(Integer id);

    ArrayList<Student> selectByStudent(StudentVO studentVO);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}