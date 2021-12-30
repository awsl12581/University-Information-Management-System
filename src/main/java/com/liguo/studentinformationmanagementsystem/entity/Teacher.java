package com.liguo.studentinformationmanagementsystem.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com.liguo.studentinformationmanagementsystem.entity.Teacher")
@Data
public class Teacher {

    @ExcelIgnore
    @ApiModelProperty(value = "")
    private Integer id;

    @ExcelProperty("职工号")
    @ApiModelProperty(value = "")
    private String teacherId;

    @ExcelProperty("姓名")
    @ApiModelProperty(value = "")
    private String teacherName;

    @ExcelProperty("性别")
    @ApiModelProperty(value = "")
    private String sex;

    @ExcelProperty("电话")
    @ApiModelProperty(value = "")
    private String teacherTel;

    @ExcelProperty("学院")
    @ApiModelProperty(value = "")
    private String faculty;
}