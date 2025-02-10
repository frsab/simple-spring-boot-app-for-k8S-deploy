package org.saber.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public/")
public class ApiController {

    // Méthode GET simple
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }


}
