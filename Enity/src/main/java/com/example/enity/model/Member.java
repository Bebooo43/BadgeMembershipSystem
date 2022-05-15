package com.example.enity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String email;
    private char status;
    @ManyToMany(fetch = FetchType.EAGER)
    Collection<Role> roles= new ArrayList<>();
//    @OneToMany
//    List<Transaction> transactionList = new ArrayList<>();
    @OneToMany
    List<Badge>badgeList = new ArrayList<>();
    @OneToMany
    List<Membership>membershipList=new ArrayList<>();


}
