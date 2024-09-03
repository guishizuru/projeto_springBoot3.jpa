package com.projetoSpringCursoNelio.projetoSpringCursoNelio.controllers;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Order;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.User;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.services.OrderService;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.services.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {

        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findByid(@PathVariable Long id){
        Order obj = service.findByid(id);
        return ResponseEntity.ok().body(obj);
    }
}
