package com.liguo.studentinformationmanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.liguo.studentinformationmanagementsystem.mapper")
public class StudentInformationManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentInformationManagementSystemApplication.class, args);
    }

}
