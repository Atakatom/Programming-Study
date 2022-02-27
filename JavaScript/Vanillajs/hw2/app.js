const ulDOM = document.querySelector("#list")
const textDOM=document.querySelector("#task")
const spamDOM=document.querySelector("#liveToastBtn")

let listArr=localStorage.getItem("Items")?JSON.parse(localStorage.getItem("Items")):[]

if(localStorage.getItem("Items"))
{
    listArr.forEach((element,index) => {
        createLiElement(element,index)            
    });
}     

spamDOM.addEventListener('click', addItem)

document.querySelector('#task').addEventListener('keypress', function (e) {
    if (e.key === 'Enter') {
      addItem();
    }
});

function createLiElement(element,index){

    let liDOM=document.createElement("li")
    let textLiDOM=document.createTextNode(element)
    let iconDOM=document.createElement("i")
    iconDOM.classList.add("bi","bi-x-lg","close")
    iconDOM.addEventListener("click",() => {
        deleteLiElement(index,iconDOM)
    })
    liDOM.addEventListener("click",changeLiState)
    liDOM.append(textLiDOM)
    liDOM.append(iconDOM)
    ulDOM.prepend(liDOM)

}


function addItem()
{
    if(textDOM.value.trim('').length != 0)
    {   
        listArr.push(textDOM.value)
        localStorage.setItem("Items",JSON.stringify(listArr))
        textDOM.value=""  
        $('#addToast').toast('show')
        createLiElement(textDOM.value,listArr.length-1)
    }else{
        $('#errorToast').toast('show') 
    }


}

function changeLiState(){    
    this.classList.toggle("bg-info")
    this.classList.toggle("text-white")
    this.style.textDecoration=(this.style.textDecoration=="line-through")?"none":"line-through"
}

function deleteLiElement(index,d){
    listArr.splice(index, 1)
    localStorage.setItem("Items",JSON.stringify(listArr))
    d.parentElement.remove()
    $('#removeToast').toast('show')
}