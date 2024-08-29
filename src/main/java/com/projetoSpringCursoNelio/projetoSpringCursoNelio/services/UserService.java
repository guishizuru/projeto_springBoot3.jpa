package com.projetoSpringCursoNelio.projetoSpringCursoNelio.services;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.User;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<User> findAll(){
       return  repository.findAll();
    }
    public User findByid(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
