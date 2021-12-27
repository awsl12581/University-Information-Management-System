package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.ExamSchedule")
@Data
public class ExamSchedule {
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
    private String courseId;

    /**
     */
    @ApiModelProperty(value="")
    private String courseName;

    /**
     */
    @ApiModelProperty(value="")
    private String teacherName;

    /**
     */
    @ApiModelProperty(value="")
    private Date startTime;

    /**
     */
    @ApiModelProperty(value="")
    private String remark;
}