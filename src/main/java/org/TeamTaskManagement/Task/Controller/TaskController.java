package org.TeamTaskManagement.Task.Controller;

import org.TeamTaskManagement.Task.Model.Task;
import org.TeamTaskManagement.Task.Repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/filter")
    public List<Task> filterTasks(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) LocalDate deadline
    ) {
        return taskRepository.findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrStatusContainingIgnoreCaseOrDeadline(title, description, status, deadline);
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }
}
