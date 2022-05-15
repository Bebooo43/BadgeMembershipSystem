package miu.edu.ea.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class LocationDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean hasTimeSlot;
    private char status;

    @OneToMany(mappedBy = "locationDate")
    @JoinColumn(name="locationDate_id")
    private List<LocationTimeSlot> locationTimeSlots = new java.util.ArrayList<>();

    @OneToMany(mappedBy = "locationDate")
    @JoinColumn(name="locationDate_id")
    private List<LocationClosed> locationClosedList = new java.util.ArrayList<>();


}