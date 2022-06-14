package org.generation.SpringAssessment.service;

import org.generation.SpringAssessment.repository.ToDoRepository;
import org.generation.SpringAssessment.repository.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServiceMySQL implements ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoServiceMySQL(@Autowired ToDoRepository todorepository) {
        this.toDoRepository = todorepository;
    }

    @Override
    public ToDo save(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    @Override
    public List<ToDo> all() {
        List<ToDo> result = new ArrayList<>();
        toDoRepository.findAll().forEach(result :: add);
        return result;
    }
}
