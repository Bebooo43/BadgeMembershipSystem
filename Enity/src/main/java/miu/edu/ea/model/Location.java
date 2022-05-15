package miu.edu.ea.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private int capacity;
    private char status;

    @ManyToOne
    @JoinColumn(name = "location_date_ID")
    private LocationDate locationDate;

    @OneToMany
    @JoinColumn(name="location_id")
    private List<Membership> memberships;

    @OneToMany
    @JoinColumn(name="location_id")
    private List<Transaction> transactions;

    @Enumerated(EnumType.STRING)
    private LocationType locationType;
}
