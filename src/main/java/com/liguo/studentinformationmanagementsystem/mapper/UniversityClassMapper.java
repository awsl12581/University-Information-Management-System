package com.liguo.studentinformationmanagementsystem.mapper;

import com.liguo.studentinformationmanagementsystem.entity.UniversityClass;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UniversityClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UniversityClass record);

    int insertSelective(UniversityClass record);

    UniversityClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UniversityClass record);

    int updateByPrimaryKey(UniversityClass record);
}