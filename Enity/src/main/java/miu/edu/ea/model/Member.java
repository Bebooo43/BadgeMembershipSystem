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
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private char status;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="member_id")
    private List<Role> roles;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="member_id")
    private List<Transaction> transactions;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="member_id")
    private List<Membership> memberships;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="member_id")
    private List<Badge> badges;
}
