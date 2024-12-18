package org.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Main {

    @RequestMapping("/")
    String home() {
        return "HELLO SHWETA! THIRD JAVA TEST";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

}