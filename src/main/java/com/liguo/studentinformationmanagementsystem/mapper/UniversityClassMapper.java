package com.liguo.studentinformationmanagementsystem.mapper;

import com.liguo.studentinformationmanagementsystem.entity.UniversityClass;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UniversityClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UniversityClass record);

    int insertSelective(UniversityClass record);

    UniversityClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UniversityClass record);

    int updateByPrimaryKey(UniversityClass record);
}