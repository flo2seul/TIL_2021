const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("#login-form button ");
const greeting = document.querySelector("#greeting");

const HIDDEN_CLASSNAME = "hidden";

function onLoginSubmit(event) {
    event.preventDefault();
    loginForm.classList.add(HIDDEN_CLASSNAME);
    const username = loginInput.value;
    console.log(username);
    greeting.innerText = `Hello ${username}`; //변수랑 string합쳐서 내보내기 `${}`
    greeting.classList.remove(HIDDEN_CLASSNAME)
    }

loginForm.addEventListener("submit", onLoginSubmit);
