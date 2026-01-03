package br.com.estudos.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudos.springboot.model.User;

@RestController
@RequestMapping(value = "/Users")
public class UserController {
    
    @GetMapping
    public ResponseEntity<User> finndAll() {
        User newUser = new User(1L, "Maria", "maria@gmail.com", "99999999", "123456");
        return ResponseEntity.ok().body(newUser);
    }
}
