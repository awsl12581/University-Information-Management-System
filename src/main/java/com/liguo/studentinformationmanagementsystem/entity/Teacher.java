package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.Teacher")
@Data
public class Teacher {
    /**
     */
    @ApiModelProperty(value="")
    private Integer id;

    /**
     */
    @ApiModelProperty(value="")
    private String teacherId;

    /**
     */
    @ApiModelProperty(value="")
    private String teacherName;

    /**
     */
    @ApiModelProperty(value="")
    private String sex;

    /**
     */
    @ApiModelProperty(value="")
    private String teacherTel;

    /**
     */
    @ApiModelProperty(value="")
    private String faculty;
}