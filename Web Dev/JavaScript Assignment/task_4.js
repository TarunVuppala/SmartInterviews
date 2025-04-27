var golbalVar = "Global Var.";

function f1() {
    let localVar = "Local Var 1.";
    const localVar2 = "Local Var 2.";
    var localVar3 = "Local Var 3.";
    console.log(golbalVar);
    console.log(localVar);
    console.log(localVar2);
    console.log(localVar3);
}

console.log(golbalVar);
f1();