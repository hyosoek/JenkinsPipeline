package com.example.jenkinspipeline;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public Integer sum(Integer a, Integer b){
        a = a;
        return a+b;
    }
}
