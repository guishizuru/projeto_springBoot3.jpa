package com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.OrderItem;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
