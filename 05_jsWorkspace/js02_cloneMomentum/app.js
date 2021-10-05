const title = document.querySelector(".hello:first-child h1");

console.dir(title);
function handleTitleClick(){
    console.log("title was clicked");
}

function handleMouseEnter(){
    console.log("Mouse is here");
}

function handleMouseLeave(){
    console.log("Mouse is gone");
}
title .addEventListener("click", handleTitleClick); //유저가 클릭할 때, js가 대신 눌러줌
title.addEventListener("mouseenter",handleMouseEnter);
title.addEventListener("mouseleave", handleMouseLeave);
