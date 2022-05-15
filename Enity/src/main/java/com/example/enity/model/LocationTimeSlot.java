package com.example.enity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LocationTimeSlot {

    @Id
    @GeneratedValue
    private Long id;
    private Date startTime;
    private Date endTime;
    private Date date;
    private char status;
    @ManyToMany
    private WeekDays weekDays;

}
