package com.liguo.studentinformationmanagementsystem.pojo;

import lombok.Data;

/**
 * @author nongChaTea
 * @date 2021/12/27 15:03
 */
@Data
public class UserVO {
    private String username;
    private String password;

    public UserVO(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
