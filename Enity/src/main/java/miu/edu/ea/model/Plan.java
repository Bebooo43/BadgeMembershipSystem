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
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private int count;
    private boolean isLimited;
    private char status;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="member_id")
    private List<Role> roles;
}
