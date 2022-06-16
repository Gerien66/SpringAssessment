const toDoControl = new ToDoController();

newToDoForm.addEventListener("submit", (event) => {
    event.preventDefault();

    let title = document.querySelector("#newToDoTitle").value;
    let description = document.querySelector("#newToDoDescription").value;
    let toDoDate = document.querySelector("#newToDoDate").value;



    toDoControl.addToDo(title, description, toDoDate);

    document.querySelector("#newToDoTitle").value = "";
    document.querySelector("#newToDoDescription").value = "";
    document.querySelector("#newToDoDate").value = "";
});
