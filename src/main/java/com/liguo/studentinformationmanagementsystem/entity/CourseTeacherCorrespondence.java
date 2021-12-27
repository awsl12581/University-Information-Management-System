package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.CourseTeacherCorrespondence")
@Data
public class CourseTeacherCorrespondence {
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

    /**
     */
    @ApiModelProperty(value="")
    private String teacherId;

    /**
     */
    @ApiModelProperty(value="")
    private String teacherName;

    /**
     * 公修，选修，专业
     */
    @ApiModelProperty(value="公修，选修，专业")
    private String courseNature;
}