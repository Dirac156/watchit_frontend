"use strict";

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.changeTmpColor = changeTmpColor;
function changeTmpColor(tmp, icon) {
    var allClass = icon.classList;
    console.log(allClass);
    if (tmp > 15) {
        if (allClass.includes("info-bar__icon--tmp-hot")) {
            icon.classList.add("info-bar__icon--tmp-hot");
        }
    } else {
        if (allClass.includes("info-bar__icon--tmp-cool")) {
            icon.classList.add("info-bar__icon--tmp-cool");
        }
    }
}