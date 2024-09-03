package com.projetoSpringCursoNelio.projetoSpringCursoNelio.services;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Product;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRespository cantegoryRespository;
    public List<Product> findAll(){
       return  cantegoryRespository.findAll();
    }
    public Product findByid(Long id){
        Optional<Product> obj = cantegoryRespository.findById(id);
        return obj.get();
    }
}
