package com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;


    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<>();


    public User() {

    }

    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
