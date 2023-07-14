package com.qf.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/hello")
//@RestController
//@ConfigurationProperties(prefix = "person")
//@EnableTransactionManagement
public class HelloController {


    @Value("${uname}")
    private String uname;

    private  String name;
    private  int age;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "============> "+ uname;
    }
    @RequestMapping("/student")
    public String student(){
        return "===="+name+sex+age;
    }
}
