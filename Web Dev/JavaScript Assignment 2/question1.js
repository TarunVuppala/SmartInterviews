/**
 * 
 * works as variables are hoisted to the top of the code block, but before initialization the variable is undefined.
console.log(mysteryVariable);
mysteryVariable = 10;
console.log(mysteryVariable);
function revealMystery() {
    console.log('Inside revealMystery:', mysteryVariable);
    var mysteryVariable = 20;
    console.log('Inside revealMystery(after declaration):', mysteryVariable);
}
revealMystery();
console.log('After revealMystery:', mysteryVariable);
 */

/** 
 * throwing an refrence error as we are trying to access the variable before it is declared
 * console.log(mysteryVariableLet);
let mysteryVariableLet = 10;
console.log(mysteryVariableLet);

function revealMysteryLet() {
  console.log("Inside revealMysteryLet:", mysteryVariableLet);
  let mysteryVariableLet = 20;
}
revealMysteryLet();
console.log("After revealMysteryLet:", mysteryVariableLet);
*/

console.log(mysteryVariableLet);
let mysteryVariableLet = 10;
console.log(mysteryVariableLet);

function revealMysteryLet() {
    console.log("Inside revealMysteryLet:", mysteryVariableLet);
    let mysteryVariableLet = 20;
}
revealMysteryLet();
console.log("After revealMysteryLet:", mysteryVariableLet);