package org.generation.SpringAssessment.service;

import org.generation.SpringAssessment.repository.entity.ToDo;

import java.util.List;

public interface ToDoService {

    List<ToDo> all();

    ToDo save(ToDo toDo);
}
