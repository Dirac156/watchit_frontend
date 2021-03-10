function changeTmpColor(tmp, icon) {
    //change the text and icon color of the temperature depending on the actual temperature
    if (tmp > 20) {
        if (!($(icon).hasClass("info-bar__icon--tmp-hot"))) {
            $(icon).removeClass("info-bar__icon--tmp-cool");
            $(icon).removeClass("info-bar__icon--tmp-cold");
            $(icon).addClass("info-bar__icon--tmp-hot");
            $(".info-bar__text--tmp").removeClass("info-bar__icon--tmp-cool");
            $(".info-bar__text--tmp").removeClass("info-bar__icon--tmp-cold");
            $(".info-bar__text--tmp").addClass("info-bar__icon--tmp-hot");
        }
    } else if(tmp > 15) {
        if (!($(icon).hasClass("info-bar__icon--tmp-cool"))){
            $(icon).removeClass("info-bar__icon--tmp-hot");
            $(icon).removeClass("info-bar__icon--tmp-cold");
            $(icon).addClass("info-bar__icon--tmp-cool");
            $(".info-bar__text--tmp").removeClass("info-bar__icon--tmp-hot");
            $(".info-bar__text--tmp").removeClass("info-bar__icon--tmp-cold");
            $(".info-bar__text--tmp").addClass("info-bar__icon--tmp-cool");
        } 
    } else{
        if (!($(icon).hasClass("info-bar__icon--tmp-cold"))){
            $(icon).removeClass("info-bar__icon--tmp-hot");
            $(icon).removeClass("info-bar__icon--tmp-cool");
            $(icon).addClass("info-bar__icon--tmp-cold");
            $(".info-bar__text--tmp").removeClass("info-bar__icon--tmp-hot");
            $(".info-bar__text--tmp").removeClass("info-bar__icon--tmp-cool");
            $(".info-bar__text--tmp").addClass("info-bar__icon--tmp-cold");
        }  
    }
}


async function getTempData(url = '') {
    // Default options are marked with *
    await fetch(url)
    .then(res => res.json())
    .then(function(data){
        return updateTmpOnScreen(data.main.temp);
    })
    .catch(err => console.log(err));
}

const updateTmpOnScreen = function(tmp){
    document.getElementById("temperature").innerHTML = tmp;
    changeTmpColor(tmp, ".info-bar__icon--tmp");
}


const city = "kigali";
const endPoint = "https://api.openweathermap.org/data/2.5/weather?";
const units = "metric";
const appid = "7d55e1a2e4368af513cd77318058fef9";
const url = endPoint + "q=" + city + "&units=" + units + "&appid=" + appid;

var Moisture = document.getElementById("moisture");

setInterval(function () {
    let date = new Date();
    date.setSeconds(date.getSeconds() + 1);
    let time = date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
    document.getElementById("time").innerHTML = time;
}, 1000);

getTempData(url);

setInterval(() => {getTempData(url)}, 2000);

// setInterval(() => {updateTmpOnScreen(27)}, 1000)



Moisture.innerHTML = "20";