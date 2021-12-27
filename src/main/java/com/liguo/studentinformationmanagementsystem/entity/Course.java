package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.Course")
@Data
public class Course {
    /**
     */
    @ApiModelProperty(value="")
    private Integer id;

    /**
     */
    @ApiModelProperty(value="")
    private String courseId;

    /**
     */
    @ApiModelProperty(value="")
    private String courseName;
}