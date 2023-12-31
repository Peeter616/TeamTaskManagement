package org.TeamTaskManagement.Task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import org.TeamTaskManagement.Task.Model.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    List<Task> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrStatusContainingIgnoreCaseOrDeadline(String title, String description, String status, LocalDate deadline);
}
