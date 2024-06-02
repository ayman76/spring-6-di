package com.example.spring6di.service.impl;

import com.example.spring6di.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceConstructorInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From Greeting Constructor Bean";
    }
}
