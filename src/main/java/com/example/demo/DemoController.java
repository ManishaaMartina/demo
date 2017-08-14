package com.example.demo;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController

public class DemoController {

@RequestMapping("/")
String home() {
return "welcome";
}

/* public static void main(String[] args) throws Exception {
 SpringApplication.run(ExampleController.class, args);
 }*/

    }