package com.example.spring6di.service.i18N;

import com.example.spring6di.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hola mundo - ES";
    }
}
