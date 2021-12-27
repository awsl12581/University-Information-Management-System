package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.UniversityClass")
@Data
public class UniversityClass {
    /**
     */
    @ApiModelProperty(value="")
    private Integer id;

    /**
     */
    @ApiModelProperty(value="")
    private String classId;

    /**
     */
    @ApiModelProperty(value="")
    private String classMonitorId;

    /**
     */
    @ApiModelProperty(value="")
    private String classTutorId;
}