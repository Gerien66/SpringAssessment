const toDoControl = new ToDoController();

newToDoForm.addEventListener("submit", (event) => {
    event.preventDefault();

    const title = document.querySelector("#newToDoTitle").value;
    const description = document.querySelector("#newToDoDescription").value;
    const toDoDate = document.querySelector("#newToDoDate").value;

    title = "";
    description = "";
    toDoDate = "";

    toDoControl.addToDo(title, description, toDoDate);
});
