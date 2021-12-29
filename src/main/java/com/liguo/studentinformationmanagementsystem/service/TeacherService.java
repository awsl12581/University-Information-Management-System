package com.liguo.studentinformationmanagementsystem.service;

import com.liguo.studentinformationmanagementsystem.entity.Teacher;
import com.liguo.studentinformationmanagementsystem.mapper.TeacherMapper;
import com.liguo.studentinformationmanagementsystem.pojo.StudentVO;
import com.liguo.studentinformationmanagementsystem.pojo.TeacherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nongChaTea
 * @date 2021/12/28 11:00
 */
@Service
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    UserService userService;

    public ArrayList<Teacher> findStudentOrListByStudentVO(TeacherVO teacherVO) {
        ArrayList<Teacher> teacherArrayList = teacherMapper.selectByTeacher(teacherVO);
        return teacherArrayList;
    }

    public int updateStudentMsgByStudentId(Teacher teacher) {
        return teacherMapper.updateByPrimaryKeySelective(teacher);
    }

    /**
     * 都要删除，包括账号
     * @param teacherId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int deleteMsg(String teacherId) {

        int i = userService.deleteUserByUsername(teacherId);
        int i1 = teacherMapper.deleteByPrimaryKey(teacherId);
        if(i1!=0){
            return 1;
        }
        return 0;
    }

    public int insertDataByExcel(List<Teacher> dataList) {
        return teacherMapper.insert(dataList);
    }
}
