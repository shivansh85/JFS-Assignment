"use strict";
//a
function add(a = 5, b = 5) {
    console.log(a + b);
}
add();
add(2, 2);
add(10, 2);
//b
let displayFriend = function (name, ...friend) {
    console.log(name);
    for (let frn of friend) {
        console.log(frn);
    }
};
// let friendList = ["abc", "xyz", "try"];
displayFriend("shivansh", "friendList", "abc", "xyz", "try");
let friendList = ["abc", "xyz", "try"];
displayFriend("shivansh", ...friendList);
//c
console.log(" ");
let pringCapitalName = (...name) => {
    for (let n of name) {
        console.log(n.toUpperCase());
    }
};
let nameList = ["Shivansh", "kallu", "ashley"];
pringCapitalName(...nameList);
//# sourceMappingURL=demo.js.map