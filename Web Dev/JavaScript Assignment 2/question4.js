
function sumAll(...numbers) {
    return numbers.reduce((total, value) => total + value, 0);
}

console.log(sumAll());
console.log(sumAll(4, 5));
console.log(sumAll(1, 2, 3, 4));


function processArguments(fn, ...args) {
    return fn(...args);
}

function multiply(x, y) {
    return x * y;
}

console.log(processArguments(multiply, 6, 7));
console.log(processArguments(sumAll, 3, 9, 5, 1));