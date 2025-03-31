package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.MappedInterceptor;

@RestController("")
@RequestMapping("/api")
public class PruebaRestController {
    @GetMapping("/prueba")
    public String prueba() {
        return "Prueba";
    }

}
