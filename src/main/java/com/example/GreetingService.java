package com.example;

// STEP 1: This is a simple POJO class (Plain Old Java Object)
// Spring will create an object of this class based on XML configuration
public class GreetingService {

    // STEP 7: This method will be called after getting the bean from container
    public void sayHello(){

        // STEP 8: Normal Java execution happens here
        System.out.println(" Hello From Spring! ");
    }
}