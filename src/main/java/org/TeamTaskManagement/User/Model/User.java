package org.TeamTaskManagement.User.Model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "USERS")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "ID", unique = true)
    private UUID id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;
}
