package com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Category;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product,Long> {
}
