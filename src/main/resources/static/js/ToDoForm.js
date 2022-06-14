const toDoControl = new ToDoController();

newToDoForm.addEventListener("submit", (event) => {
    event.preventDefault();

    let title = document.querySelector("#newToDoTitle").value;
    let description = document.querySelector("#newToDoDescription").value;
    let toDoDate = document.querySelector("#newToDoDate").value;

    title = "";
    description = "";
    toDoDate = "";

    toDoControl.addToDo(title, description, toDoDate);
});
