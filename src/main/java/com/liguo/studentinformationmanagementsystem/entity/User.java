package com.liguo.studentinformationmanagementsystem.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.User")
@Data
public class User {
    /**
     */
    @ExcelIgnore
    @ApiModelProperty(value="")
    private Integer id;

    /**
     */
    @ExcelProperty("用户名")
    @ApiModelProperty(value="")
    private String username;

    /**
     */
    @ExcelProperty("密码")
    @ApiModelProperty(value="")
    private String password;

    /**
     */
    @ExcelProperty("权限")
    @ApiModelProperty(value="")
    private String privilege;
}