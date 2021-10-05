const title = document.querySelector(".hello:first-child h1");

function handleTitleClick(){
    console.log("title was clicked");
}

title .addEventListener("click", handleTitleClick); //유저가 클릭할 때, js가 대신 눌러줌

