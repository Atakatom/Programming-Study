let userFormDOM = document.querySelector('#userForm')
userFormDOM.addEventListener('submit',formHandler)

function formHandler(event){
    event.preventDefault()
    const USER_NAME =document.querySelector('#userName')
    const SCORE = document.querySelector('#score')
    console.log(SCORE.value);
    console.log(USER_NAME.value);
    addItem(USER_NAME.value, SCORE.value)
}

let userListDOM = document.querySelector('#userList')
const addItem = (userName, score) => {
    let liDOM = document.createElement('li')
    liDOM.innerHTML = `${userName} ${score}`
    userListDOM.append(liDOM)
}