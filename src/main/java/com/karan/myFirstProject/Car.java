package com.karan.myFirstProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Annotation for creating an API endpoint
public class Car {

    @Autowired
    private Dog dog; // Here we are using dog object of Dog class, this is what we call Dependency injection

    // IOC container keeps dog bean inside it, so that it can be used anywhere

    @GetMapping("/ok")  // now we can visit -- http://localhost:8082/ok, then we can see Always have fun
    public String ok(){
        return dog.fun();// fun method is defined in dog class, which is returning Always have fun
    }

}
