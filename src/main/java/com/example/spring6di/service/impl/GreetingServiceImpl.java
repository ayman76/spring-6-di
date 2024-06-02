package com.example.spring6di.service.impl;

import com.example.spring6di.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service!!!!";
    }
}
