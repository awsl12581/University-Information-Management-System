package com.liguo.studentinformationmanagementsystem.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 添加注解
 */
@ApiModel(value = "com.liguo.studentinformationmanagementsystem.entity.Student")
//引入@Data注解，进行getter和setter的自动装配
@Data
public class Student {

    @ExcelIgnore
    @ApiModelProperty(value = "")
    private Integer id;

    @ExcelProperty("姓名")
    @ApiModelProperty(value = "")
    private String studentName;

    @ExcelProperty("学号")
    @ApiModelProperty(value = "")
    private String studentId;

    @ExcelProperty("性别")
    @ApiModelProperty(value = "")
    private String sex;

    @ExcelProperty("QQ")
    @ApiModelProperty(value = "")
    private String studentQq;

    @ExcelProperty("班级")
    @ApiModelProperty(value = "")
    private String studentClass;

    @ExcelProperty("电话")
    @ApiModelProperty(value = "")
    private String studentTel;

}