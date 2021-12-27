package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.Student")
@Data
public class Student {
    /**
     */
    @ApiModelProperty(value="")
    private Integer id;

    /**
     */
    @ApiModelProperty(value="")
    private String studentName;

    /**
     */
    @ApiModelProperty(value="")
    private String studentId;

    /**
     */
    @ApiModelProperty(value="")
    private String sex;

    /**
     */
    @ApiModelProperty(value="")
    private String studentQq;

    /**
     */
    @ApiModelProperty(value="")
    private String studentClass;

    /**
     */
    @ApiModelProperty(value="")
    private String studentTel;

    /**
     */
    @ApiModelProperty(value="")
    private byte[] photo;
}