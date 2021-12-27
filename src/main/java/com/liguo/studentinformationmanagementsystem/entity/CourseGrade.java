package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author ASUS
 */
@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.CourseGrade")
@Data
public class CourseGrade {
    /**
     */
    @ApiModelProperty(value="主键id")
    private Integer id;

    /**
     * 学号
     */
    @ApiModelProperty(value="学号")
    private String studentId;

    /**
     * 名字
     */
    @ApiModelProperty(value="学生姓名")
    private String studentName;

    /**
     *
     * 课程id
     */
    @ApiModelProperty(value="课程id")
    private String courseId;

    /**
     * 课程名
     */
    @ApiModelProperty(value="课程名")
    private String courseName;

    /**
     * 成绩，默认-1
     */
    @ApiModelProperty(value="成绩，默认-1")
    private BigDecimal grade;
}