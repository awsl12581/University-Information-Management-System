package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.Course")
@Data
public class Course {
    /**
     * 主键id
     */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     *
     * 课程id
     */
    @ApiModelProperty(value="课程id号")
    private String courseId;

    /**
     * 课程名
     */
    @ApiModelProperty(value="课程名")
    private String courseName;
}