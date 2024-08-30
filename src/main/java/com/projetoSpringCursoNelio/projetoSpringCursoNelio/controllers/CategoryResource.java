package com.projetoSpringCursoNelio.projetoSpringCursoNelio.controllers;


import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Category;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.User;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.services.CategoryService;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {

        List<Category> list = categoryService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findByid(@PathVariable Long id){
        Category obj = categoryService.findByid(id);
        return ResponseEntity.ok().body(obj);
    }

}
