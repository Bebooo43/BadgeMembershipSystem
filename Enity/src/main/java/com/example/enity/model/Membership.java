package com.example.enity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Membership {
    @Id
    @GeneratedValue
    private long id;
    private Date startDate;
    private Date endDate;
    @OneToMany
    List<Plan>planList = new ArrayList<>();
    @OneToOne
    private Membership membership;

}
