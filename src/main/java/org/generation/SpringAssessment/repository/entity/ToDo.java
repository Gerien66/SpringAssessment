package org.generation.SpringAssessment.repository.entity;

import org.generation.SpringAssessment.Controller.dto.ToDoDto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "todolist")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public String title;
    public String description;
    public LocalDate toDoDate;

    public ToDo() {

    }

    public ToDo(ToDoDto toDoDto) {
        this.title = toDoDto.getTitle();
        this.description = toDoDto.getDescription();
        this.toDoDate = toDoDto.getToDoDate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getToDoDate() {
        return toDoDate;
    }

    public void setToDoDate(LocalDate toDoDate) {
        this.toDoDate = toDoDate;
    }
}
