package com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
