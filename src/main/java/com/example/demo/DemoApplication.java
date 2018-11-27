package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 位于基础包的自包中,设置 scanBasePackages启动包在的位置
//scan 设置mapper 接口所在的包

@SpringBootApplication(scanBasePackages ="com.example.demo" )
@MapperScan(basePackages = "com.example.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
