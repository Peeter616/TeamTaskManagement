package org.TeamTaskManagement.Task.Model;

import java.util.UUID;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Task {

    @Id
    @Column(name = "ID", unique = true)
    @Type(type = "uuid-char")
    private UUID id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DEADLINE")
    private LocalDate deadline;

    @Column(name = "USERS")
    private String users;
}
