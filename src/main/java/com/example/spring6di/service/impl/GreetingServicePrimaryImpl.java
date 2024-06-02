package com.example.spring6di.service.impl;

import com.example.spring6di.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Primary Bean!!!!";
    }
}
