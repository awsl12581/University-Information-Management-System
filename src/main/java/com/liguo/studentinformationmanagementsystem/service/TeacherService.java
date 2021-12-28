package com.liguo.studentinformationmanagementsystem.service;

import com.liguo.studentinformationmanagementsystem.entity.Teacher;
import com.liguo.studentinformationmanagementsystem.mapper.TeacherMapper;
import com.liguo.studentinformationmanagementsystem.pojo.StudentVO;
import com.liguo.studentinformationmanagementsystem.pojo.TeacherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author nongChaTea
 * @date 2021/12/28 11:00
 */
@Service
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    public ArrayList<Teacher> findStudentOrListByStudentVO(TeacherVO teacherVO) {
        ArrayList<Teacher> teacherArrayList = teacherMapper.selectByTeacher(teacherVO);
        return teacherArrayList;
    }
}
