package com.karan.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //--tells Spring that this class will handle web requests (like a “traffic controller”).

public class MyClass {
    //going to create an API endpoint

    @GetMapping("abc") //-- tells Spring which URL should trigger the method.
    //defines API endpoint at /abc
    // so when user will type : http://localhost:8080/abc, hello will appear in response
    public  String sayHello(){
        return "hello";
    }

}
//API / Controller has been created
// Localhost:8080/abc
//Context path --> name of application, but in our case we will use; localhost:8080/my project/abc
//localhost:8080/abc