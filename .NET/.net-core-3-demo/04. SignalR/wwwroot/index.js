//import { signalR } from "./lib/@aspnet/signalr/dist/browser/signalr";

let connection = null;

setupConnection = () => {
    connection = new signalR.HubConnectionBuilder()
        .withUrl("/countHub")
        .build();

    connection.on("ReceiveUpdate", update => {
        const resultDiv = document.getElementById("result");
        resultDiv.innerHTML = update;
    });

    connection.on("someFunc", obj => {
        const resultDiv = document.getElementById("result");
        resultDiv.innerHTML = "someone called, parameters: " + obj.random;
    });

    connection.on("Finished", () => {
        try {
            setTimeout(() => {
                connection.stop(); 
            }, 2000);
            
            const resultDiv = document.getElementById("result");
            resultDiv.innerHTML = "Finished";
        } catch (err) {
            console.log(err);
        }
        
    });

    connection.start()
        .catch(err => console.log(err));
};

setupConnection();

document.getElementById("submit").addEventListener("click", e => {
    e.preventDefault();

    fetch("api/count", {
        method: "post",
        headers: {
            'content-type': "application/json"
        }
    }).then(response => response.text())
        .then(id => connection.invoke("GetLatestCount", id));
});