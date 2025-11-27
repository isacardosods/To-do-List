package com.cardoso.api_tarefas.controller;

import com.cardoso.api_tarefas.service.TaskService;
import com.cardoso.api_tarefas.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    List<Task> create(@RequestBody Task task){
        return taskService.create(task);
    }

    @GetMapping
    List<Task> list(){
        return taskService.list();
    }

    @PutMapping
    List<Task> update(@RequestBody Task task){
        return taskService.update(task);
    }

    @DeleteMapping("{id}")
    List<Task> delete(@PathVariable("id") Long id){
        return taskService.delete(id);
    }
}
