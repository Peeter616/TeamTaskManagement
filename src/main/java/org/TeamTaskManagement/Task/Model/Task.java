package org.TeamTaskManagement.Task.Model;

import java.util.Set;
import java.util.UUID;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.TeamTaskManagement.User.Model.User;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "TASK")
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @Column(name = "ID", unique = true)
    private UUID id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DEADLINE")
    private LocalDate deadline;

    @ManyToMany
    @Column(name = "USERS")
    private Set<User> users;
}
