const age = parseInt(prompt("How old are you"));//parsInt() type 변경 (to number)


console.log(isNaN(age)); //isNaN() number인지 아닌지 알려줌

if(isNaN(age) || age < 0) {
    console.log("Please write a real positive number");
} else if (age < 18) {
    console.log("You are too young.");
}else if( age >= 18 || age <= 50) {
    console.log("You can drink");
} else if (age > 50 && age <= 80) {
    console.log("you should exercise")
} else if (age > 80) {
    console.log("you can do averything")
}
else {
    console.log("You can't drink")
}

