package dev.santiago.crud.model;

import jakarta.persistence.*;

import java.util.List;

@Entity (name = "work")
@Table (name = "tb_work")
public class WorkModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany
    private List<UserModel> user;
}
