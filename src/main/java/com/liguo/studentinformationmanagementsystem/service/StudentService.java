package com.liguo.studentinformationmanagementsystem.service;

import com.liguo.studentinformationmanagementsystem.entity.Student;
import com.liguo.studentinformationmanagementsystem.mapper.StudentMapper;
import com.liguo.studentinformationmanagementsystem.pojo.StudentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nongChaTea
 * @date 2021/12/27 20:07
 */

@Slf4j
@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public ArrayList<Student> findStudentOrListByStudentVO(StudentVO studentVO){
        ArrayList<Student> students = studentMapper.selectByStudent(studentVO);
        return students;
    }

    public int updateStudentMsgByStudentId(Student student){
        int i = studentMapper.updateByPrimaryKey(student);
        return i;
    }

    public int insertDataByExcel(List<Student> students){
        return studentMapper.insert(students);
    }
}
