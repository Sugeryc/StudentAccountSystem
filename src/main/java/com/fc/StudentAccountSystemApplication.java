package com.fc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //SpringBoot启动类注解
@MapperScan("com.fc.dao")
public class StudentAccountSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentAccountSystemApplication.class, args);
    }

}
