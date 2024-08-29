package com.projetoSpringCursoNelio.projetoSpringCursoNelio.config;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.User;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User usuario = new User(null ,"Maria","maria@gmail.com","99999999","12345");
        User usuario2 = new User(null ,"Alex","alex@gmail.com","99999997","123456");

        userRepository.saveAll(Arrays.asList(usuario,usuario2));

    }
}
