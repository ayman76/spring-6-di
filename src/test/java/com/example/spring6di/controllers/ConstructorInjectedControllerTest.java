package com.example.spring6di.controllers;

import com.example.spring6di.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }


    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}