function square(num){
    return num*num;
}
var i = 0;
function mapRecc(arr, fun){
    if(i<arr.length){
        arr[i] = fun(arr[i]);
        i++;
        mapRecc(arr, fun);
    }
}

var arr3 = [1, 2, 3, 4, 5];
mapRecc(arr3, square);
console.log(arr3);

var arr4 = [1, 4, 9, 16, 25];
mapRecc(arr4, Math.sqrt);
console.log(arr4);