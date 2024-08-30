package com.projetoSpringCursoNelio.projetoSpringCursoNelio.services;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Order;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories.OrderRepository;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    public List<Order> findAll(){
        return  repository.findAll();
    }
    public Order findByid(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
