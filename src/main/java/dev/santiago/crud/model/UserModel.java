package dev.santiago.crud.model;

import jakarta.persistence.*;

@Entity (name = "user")
@Table (name = "tb_user")
public class UserModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "work_id")
    private WorkModel work;

    public UserModel() {
    }

    public UserModel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
