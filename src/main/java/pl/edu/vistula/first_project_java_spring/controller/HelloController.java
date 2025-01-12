package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String hello(){
        return "Hello Vistula in my first controller";
    }
}
