package com.example.enity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @Enumerated(EnumType.STRING)
//    @Column(length = 20)
//    private ERole name;
    private String name;
    private String description;
    private char status;

}
