package com.liguo.studentinformationmanagementsystem.mapper;

import com.liguo.studentinformationmanagementsystem.entity.CourseTeacherCorrespondence;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface CourseTeacherCorrespondenceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseTeacherCorrespondence record);

    int insertSelective(CourseTeacherCorrespondence record);

    CourseTeacherCorrespondence selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseTeacherCorrespondence record);

    int updateByPrimaryKey(CourseTeacherCorrespondence record);
}