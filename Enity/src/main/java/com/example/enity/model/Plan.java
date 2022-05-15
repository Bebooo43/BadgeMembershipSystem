package com.example.enity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Plan {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private Integer count;
    private boolean status;
    @OneToMany
    List<Role> roleList= new ArrayList<>();

}
