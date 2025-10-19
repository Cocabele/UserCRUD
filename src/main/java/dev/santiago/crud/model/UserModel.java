package dev.santiago.crud.model;

import jakarta.persistence.*;
import lombok.*;

@Entity (name = "user")
@Table (name = "tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "work_id")
    private WorkModel work;

}
