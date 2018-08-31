package com.how2java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//其被@SpringBootApplication 所标记，表示这个是一个Springboot 应用
public class SpringbootApplication {
//这明明跑动起来的是一个 web 程序，为什么启动方式不是启动 tomcat？ 而是启动的一个 Java 类的 主方法？
//这是因为这个 com.how2java.springboot.SpringbootApplication 类的主方法就把 tomcat 嵌入进去了，不需要手动启动 tomcat 了呢。
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
