package com.mumu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.mumu")
@MapperScan("com.mumu.mapper")
public class Test1Application {
    public static void main(String[] args) {
        SpringApplication.run(Test1Application.class, args);}
}
