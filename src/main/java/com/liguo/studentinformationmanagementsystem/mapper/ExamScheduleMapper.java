package com.liguo.studentinformationmanagementsystem.mapper;

import com.liguo.studentinformationmanagementsystem.entity.ExamSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface ExamScheduleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamSchedule record);

    int insertSelective(ExamSchedule record);

    ExamSchedule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamSchedule record);

    int updateByPrimaryKey(ExamSchedule record);
}