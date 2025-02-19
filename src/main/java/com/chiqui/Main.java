package com.chiqui;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet(){
        GreetResponse response = new GreetResponse("Hello",
        List.of("java", "js", "python"), new Person("alex", 28, 30.000));
        return response;
    }

    record Person(String name, int age, double savings){}
    record GreetResponse (String greet, List <String> favProgrammingLanguages, Person person){}
}
