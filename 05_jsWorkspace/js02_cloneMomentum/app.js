/*
const, let은 ES6버전부터 생긴 변수 선언 방식
var는 기본적인 js의 변수 선언 방식
*/
const a = 5; //const는 상수 
const b = 10;
let myName = "seula"; //let은 바꿀 수 있음. 최초로 한 번 선언 하고 다음 부터는 바로 쓰기
var c = 39; //오래된 자바스크립트 변수 선언 방식, let과 같은 방식으로 무책임^^

console.log(a+b);
console.log(a*b);
console.log(a/b);
console.log("hello " + myName);
myName = "nico"; //let으로 선언했던 변수 값 다른 것 넣어줌.

console.log("your new name is " + myName);
