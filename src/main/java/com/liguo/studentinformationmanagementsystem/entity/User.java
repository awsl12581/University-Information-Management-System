package com.liguo.studentinformationmanagementsystem.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.liguo.studentinformationmanagementsystem.entity.User")
@Data
public class User {
    /**
     */
    @ApiModelProperty(value="")
    private Integer id;

    /**
     */
    @ApiModelProperty(value="")
    private String username;

    /**
     */
    @ApiModelProperty(value="")
    private String password;

    /**
     */
    @ApiModelProperty(value="")
    private String privilege;
}