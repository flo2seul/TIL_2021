const h1 = document.querySelector(".hello:first-child h1");

console.dir(h1);
function handleTitleClick(){
    console.log("title was clicked");
}

function handleMouseEnter(){
    console.log("Mouse is here");
}

function handleMouseLeave(){
    console.log("Mouse is gone");
}
function handleWindowResize(){
     document.body.style.backgroundColor = "tomato";
}
function handleWindowCopy(){
    alert("copier!");
}
function handleWindowOffline(){
    alert("SOS no wifi");
}
function handleWindowOnline(){
    alert("ALL GOOD");
}
h1.onclick = handleTitleClick; //유저가 클릭할 때, js가 대신 눌러줌
h1.addEventListener("mouseenter",handleMouseEnter);
h1.addEventListener("mouseleave", handleMouseLeave);

window.addEventListener("resize", handleWindowResize);
window.addEventListener("copy", handleWindowCopy);
window.addEventListener("offline", handleWindowOffline);
window.addEventListener("online", handleWindowOnline);