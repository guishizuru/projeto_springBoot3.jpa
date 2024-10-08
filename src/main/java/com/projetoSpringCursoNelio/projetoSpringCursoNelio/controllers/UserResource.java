package com.projetoSpringCursoNelio.projetoSpringCursoNelio.controllers;


import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.User;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {

        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findByid(@PathVariable Long id){
        User obj = service.findByid(id);
        return ResponseEntity.ok().body(obj);
    }

}
