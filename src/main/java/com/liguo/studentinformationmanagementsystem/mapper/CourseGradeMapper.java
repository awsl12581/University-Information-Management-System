package com.liguo.studentinformationmanagementsystem.mapper;

import com.liguo.studentinformationmanagementsystem.entity.CourseGrade;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseGradeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseGrade record);

    int insertSelective(CourseGrade record);

    CourseGrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseGrade record);

    int updateByPrimaryKey(CourseGrade record);
}