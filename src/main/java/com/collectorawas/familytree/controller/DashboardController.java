package com.collectorawas.familytree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: Shubham
 */
@RestController//combination of @Controller and @ResponseBody
@RequestMapping("/family-tree/dashboard")
public class DashboardController {

    @GetMapping
    public String index() {
        return "Greetings from Spring Boot!";
    }


}