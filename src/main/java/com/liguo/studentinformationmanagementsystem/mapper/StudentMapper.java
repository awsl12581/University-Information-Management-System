package com.liguo.studentinformationmanagementsystem.mapper;

import com.liguo.studentinformationmanagementsystem.entity.Student;
import com.liguo.studentinformationmanagementsystem.pojo.StudentVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    ArrayList<Student> selectByStudent(StudentVO studentVO);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKeyWithBLOBs(Student record);

    int updateByPrimaryKey(Student record);
}