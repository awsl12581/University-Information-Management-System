package com.liguo.studentinformationmanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.liguo.studentinformationmanagementsystem.mapper")
public class StudentInformationManagementSystemApplication {


    public static AnnotationConfigApplicationContext annotationConfigApplicationContext2=null;
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(StudentInformationManagementSystemApplication.class);
        builder.headless(false).run(args);

    }

}
