let urun = document.querySelector("#data");
let ekle = document.querySelector("#add");
var liste = document.querySelector(".liste");

ekle.addEventListener("click",function(){
    console.log(1);
    let li = document.createElement("li");
    li.textContent = urun.value;
    liste.append(li);
    urun.value="";  
});