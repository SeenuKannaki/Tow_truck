package com.Tow_truck.Tow.truck.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String e_mail;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;
}
