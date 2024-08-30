package com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.Category;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CantegoryRespository extends JpaRepository<Category,Long> {
}
