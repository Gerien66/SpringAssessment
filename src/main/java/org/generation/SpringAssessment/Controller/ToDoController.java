package org.generation.SpringAssessment.Controller;

import org.generation.SpringAssessment.repository.entity.ToDo;
import org.generation.SpringAssessment.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.generation.SpringAssessment.Controller.dto.ToDoDto;

import java.time.LocalDate;

@RestController
@RequestMapping("/todolist")
public class ToDoController {

    final ToDoService toDoService;

    public ToDoController(@Autowired ToDoService todoservice) {
        this.toDoService = todoservice;
    }

    @CrossOrigin
    @GetMapping( "/all" )
    public Iterable<ToDo> getToDo() {
        return toDoService.all();
    }

    @CrossOrigin
    @PostMapping( "/add" )
    public void save(@RequestParam(name="title", required = true) String title, @RequestParam(name="description", required = true) String description, @RequestParam(name="toDoDate", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDoDate) {
        ToDoDto toDoDto = new ToDoDto(title, description, toDoDate);
        toDoService.save(new ToDo(toDoDto));
    }
}
