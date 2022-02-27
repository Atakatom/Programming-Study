let isim = prompt("Your name : ").toUpperCase();
let ad = document.getElementById("myName");

ad.innerHTML = isim;

// var date = timer.getTime();
// timer.innerHTML="akdskjfsdk";
function displayTime(){
    let str = "";
    let timer = new Date();
    var days = new Array("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar");
    str += timer.toLocaleTimeString() + " , " + days[timer.getDay()+6];
    document.getElementById("myClock").innerHTML= str;
}
setInterval(displayTime,1000);
//x.innerHTML = `${timer.getFullYear()} ${timer.getMonth()+1} ${timer.getDate()}`
