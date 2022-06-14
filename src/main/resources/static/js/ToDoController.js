class ToDoController {
    constructor() {
        this.toDo = [];
    }

    addToDo(title, description, toDoDate) {
        let toDoController = this;
        const formData = new FormData();
        formData.append("title", title);
        formData.append("descriptiono", description);
        formData.append("toDoDate", toDoDate);

        fetch("http://localhost:8080/todolist/add", {
            method: "POST",
            body: formData,
        })
            .then(function (response) {
                console.log(response.status);
                if (response.ok) {
                    alert("Successfully added ToDo!");
                }
            })
            .catch((err) => {
                console.log("Error: ", err);
                alert("Error adding item to Product");
            });
    }

    displayToDo() {

         let toDoController = this;
         toDoController.toDo = [];
        fetch("http://localhost:8080/todolist/all")
            .then((res) => res.json())
            .then(function (data) {
                console.log(data);
                data.forEach(function (toDo, index) {
                    const toDoObj = {
                        id: toDo.id,
                        title: toDo.title,
                        description: toDo.description,
                        toDoDate: toDo.toDoDate,
                    };
                    toDoController.toDo.push(toDoObj);
                });
                console.log("Hello");
                toDoController.renderToDoPage();
            })
            .catch(function (error) {
                console.log(error);
            });
    }

    renderToDoPage() {
        let toDoList = `<table class="table">
        <thead>
            <tr>
                <th scope="col">Title</th>
                <th scope="col">Description</th>
                <th scope="col">Target Date</th>
            </tr>
        </thead>
        <tbody>`;

        this.toDo.forEach((toDo) => {
            toDoList += `
            <tr>
            <td>${toDo.title}</td>
            <td>${toDo.description}</td>
            <td>${toDo.toDoDate}</td>
            </tr>
            `;
        });

        toDoList += `</tbody>
        </table>`;

        document.querySelector("#toDoListDisplay").innerHTML = toDoList;
    }
}
