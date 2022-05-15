package com.example.enity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue
private Long id;
private String name;
private Integer capacity;
private char status;
//    @OneToMany
//    List<Transaction> transactionList = new ArrayList<>();
//    @OneToMany
//    List<Membership> membershipList = new ArrayList<>();
    @OneToOne
    List<LocationDate> locationDateList = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private LocationType locationType;


}
