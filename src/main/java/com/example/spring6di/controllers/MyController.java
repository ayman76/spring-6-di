package com.example.spring6di.controllers;

import com.example.spring6di.service.GreetingService;
import com.example.spring6di.service.impl.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayGreeting(){
        System.out.println("I'm in the Controller");
        return greetingService.sayGreeting();
    }

    public String sayHello(){
        System.out.println("I'm in the Controller");
        return "Hello World";
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called By Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After Init - Called By Bean Post Processor");
    }
}
