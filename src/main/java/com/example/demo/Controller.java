package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping("/richiedinome")
    public String richiediNome(@RequestParam String nome){
        return "il nome è : " + nome;
    }
    @PostMapping("/richiediuser")
    public User richiediUser(@RequestBody User user){
        return user;
    }

}
