package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping
    public String nome(@RequestParam String stringa){
        return stringa;
    }
}
