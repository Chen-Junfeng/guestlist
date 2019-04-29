package com.cjf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cjf.dao")  //mapper 接口类包扫描
public class Guestlistv2Application {

    public static void main(String[] args) {
        SpringApplication.run(Guestlistv2Application.class, args);
    }

}
