package com.budgetapp.backend.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getGreeting() {
        return "Hello World! pt2";
    }
}
