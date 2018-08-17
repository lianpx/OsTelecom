package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.mybatis.spring.annotation.MapperScan;



//@EnableTransactionManagement
//@EnableAspectJAutoProxy
@SpringBootApplication
@MapperScan("com.demo.dao")
public class Application extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
