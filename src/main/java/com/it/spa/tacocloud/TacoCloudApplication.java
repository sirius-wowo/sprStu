package com.it.spa.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/** @SpringBootApplication 注释清楚地表明这是一个 Spring 引导应用程序。
 *  @SpringBootApplication 是一个组合了其他三个注释的复合应用程序
 *
 *  */
@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
