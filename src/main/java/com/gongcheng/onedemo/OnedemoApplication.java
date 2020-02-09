package com.gongcheng.onedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
public class OnedemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnedemoApplication.class, args);
    }
}
