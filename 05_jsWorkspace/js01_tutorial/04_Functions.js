function sayHello(nameOfPerson, age) {
    
    console.log("Hello my name is " + nameOfPerson + " and I'm ");
    
}

console.log("hello");
sayHello("nico", 23);
sayHello("seula", 24);

function plus(a,b){
    console.log(a+b);
}

plus(8, 60);

const player = {
    name: "seula",
    sayHello: function (otherPersonsName) {
        console.log("hello " + otherPersonsName + " nice to meet you")
    },
};
player.sayHello("lynn");