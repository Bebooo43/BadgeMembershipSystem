package com.example.enity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LocationDate {
    @Id
    @GeneratedValue
    private Long id;
    private Date startDate;
    private Date endDate;
    private Date startTime;
    private Date endTime;
    @OneToMany
    List<LocationClosed>locationClosedList = new ArrayList<>();
    @OneToMany
    List<LocationTimeSlot>locationTimeSlotList = new ArrayList<>();


}
