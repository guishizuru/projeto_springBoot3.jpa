package com.projetoSpringCursoNelio.projetoSpringCursoNelio.controllers;


import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Category;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Product;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.services.CategoryService;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {

        List<Product> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findByid(@PathVariable Long id){
        Product obj = productService.findByid(id);
        return ResponseEntity.ok().body(obj);
    }

}
