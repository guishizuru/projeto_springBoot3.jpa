package com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories;


import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
