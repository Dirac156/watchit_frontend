import { changeTmpColor } from "./module_tmp"; 

let Time = document.getElementById("time"); 
let Temperature = document.getElementById("temperature");
let Moisture = document.getElementById("moisture");

let date = new Date();


setInterval(() => {
    date.setSeconds(date.getSeconds() + 1);
    let time = `${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`;
    document.getElementById('time').innerHTML = time;
}, 1000);

let currentTmp = "29";
Temperature.innerHTML = currentTmp;
console.log("calling function")
changeTmpColor(currentTmp, document.querySelector("info-bar__icon--tmp"));

Moisture.innerHTML = "20";