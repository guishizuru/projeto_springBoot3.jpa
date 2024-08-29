package com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
