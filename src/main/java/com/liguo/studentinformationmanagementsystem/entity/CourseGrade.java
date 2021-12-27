package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.CourseGrade")
@Data
public class CourseGrade {
    /**
     */
    @ApiModelProperty(value="")
    private Integer id;

    /**
     */
    @ApiModelProperty(value="")
    private String studentId;

    /**
     */
    @ApiModelProperty(value="")
    private String studentName;

    /**
     */
    @ApiModelProperty(value="")
    private String courseId;

    /**
     */
    @ApiModelProperty(value="")
    private String courseName;

    /**
     * 默认-1
     */
    @ApiModelProperty(value="默认-1")
    private BigDecimal grade;
}