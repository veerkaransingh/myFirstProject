package com.karan.myFirstProject;

import org.springframework.stereotype.Component;

@Component // Inversion of control (IOC container) will scan this bean - - class becomes a bean when we add an annotation
public class Dog {
    public String fun(){
        return "Always have fun";
    }
}
