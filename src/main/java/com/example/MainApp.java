package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // STEP 2: Create Spring IoC Container
        // Spring reads the XML file from classpath
        // It loads applicationBeanContext.xml
        // Internally, Spring creates an object of the specified class.
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        // STEP 3: Spring parses XML file
        // Finds <bean id="myBean" class="com.example.GreetingService"/>

        // STEP 4: Spring creates object of GreetingService using Reflection
        // Equivalent to: new GreetingService();
        // Object is stored inside IoC container
        //The object of the class defined inside the bean tag is created and managed by Spring inside the IoC container, not by the programmer.

        // STEP 5: We request the bean from Spring container using id
        //getBean() gives you the object created and managed by Spring.
        GreetingService greetingService =
                (GreetingService) context.getBean("myBean");

        // STEP 6: Spring returns the already created object (Singleton by default)

        // STEP 7: Call method using the bean
        greetingService.sayHello();
    }
}