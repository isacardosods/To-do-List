package com.cardoso.api_tarefas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.cardoso.api_tarefas.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
