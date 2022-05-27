package com.nyfts.business.control.service.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }
}
