package com.how2java.springboot;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
//其被@SpringBootApplication 所标记，表示这个是一个Springboot 应用
public class Application {
 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
 
}