package com.loose;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        UserService userService = (UserService) context.getBean("UserService");

        userService.notifyUser(" Whats up! ");


    }
}
