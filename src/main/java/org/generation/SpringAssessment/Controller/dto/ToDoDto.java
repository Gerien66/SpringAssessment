package org.generation.SpringAssessment.Controller.dto;

import java.time.LocalDate;

public class ToDoDto {
    public String title;
    public String description;
    public LocalDate toDoDate;

    public ToDoDto(String title, String description, LocalDate toDoDate) {
        this.title = title;
        this.description = description;
        this.toDoDate = toDoDate;
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
