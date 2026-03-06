package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

    public static void main(String[] args) {

        // STEP 1: JVM starts the program and enters the main() method

        // STEP 2: This line creates the Spring IoC container
        // Spring starts initializing the container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        // STEP 3: Spring reads applicationBeanContext.xml from the classpath

        // STEP 4: Spring parses the XML file and finds the bean definition
        // <bean id="myBean" class="com.example.GreetingService"/>

        // STEP 5: Spring creates an object of GreetingService using Reflection
        // Equivalent to: new GreetingService();

        // STEP 6: The created object is stored inside the Spring IoC container
        // By default the bean scope is Singleton

        // STEP 7: We request the bean from the Spring container using its id
        GreetingService greetingService =
                (GreetingService) context.getBean("myBean");

        // STEP 8: Spring returns the already created GreetingService object

        // STEP 9: We call the method on the returned bean
        greetingService.sayHello();
    }
}