package org.generation.SpringAssessment.repository;

import org.generation.SpringAssessment.repository.entity.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends
        CrudRepository<ToDo, Integer>
{
}

