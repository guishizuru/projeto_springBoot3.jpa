package com.projetoSpringCursoNelio.projetoSpringCursoNelio.services;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Category;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.User;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories.CantegoryRespository;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CantegoryRespository cantegoryRespository;
    public List<Category> findAll(){
       return  cantegoryRespository.findAll();
    }
    public Category findByid(Long id){
        Optional<Category> obj = cantegoryRespository.findById(id);
        return obj.get();
    }
}
