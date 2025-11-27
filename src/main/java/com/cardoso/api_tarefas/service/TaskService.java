package com.cardoso.api_tarefas.service;

import com.cardoso.api_tarefas.repository.TaskRepository;
import org.springframework.data.domain.Sort;
import com.cardoso.api_tarefas.model.Task;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    //a injeção é feita utilizando um construtor pois é considerada uma boa prática e descarta o uso do @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> create(Task task){
        taskRepository.save(task);
        return list();
    }

    public List<Task> list(){
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending());
        return taskRepository.findAll(sort);
    }

    public List<Task> update(Task task){
        taskRepository.save(task);
        return list();
    }

    public List<Task> delete(Long id){
        taskRepository.deleteById(id);
        return list();
    }
}
