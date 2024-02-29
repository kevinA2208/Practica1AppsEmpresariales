package org.example.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Roles")
public class RolesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long idRol;

    @Column(name = "name_rol")
    private String nameRol;

    @ManyToMany
    Set<UserEntity> roleUsers;


}
