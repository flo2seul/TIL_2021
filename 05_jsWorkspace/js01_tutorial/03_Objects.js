const player = {
    name: "nico",
    points: 10,
    fat: true,
};
console.log(player);
console.log(player["name"]);
player.fat = false;
console.log(player.name);
console.log(player.fat);
player.lastname = "potato";
player.points = player.points + 3;
console.log(player);


