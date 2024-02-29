package org.example.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "number_document_user")
    private String numberDocumentUser;

    @Column(name = "email_user")
    private String emailUser;

    @Column(name = "password_user")
    private String passwordUser;

    @Column(name = "names_user")
    private String namesUser;

    @Column(name = "lastnames_user")
    private String lastNamesUser;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToMany
    Set<RolesEntity> userRoles;
}
