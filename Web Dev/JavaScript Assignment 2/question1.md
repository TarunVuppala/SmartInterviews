### The JavaScript Gauntlet - Part 1

## Variable Hoisting and Scoping

```
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
```

The output of this code is:
```
undefined
10
Inside revealMystery: undefined
Inside revealMystery (after declaration): 20
After revealMystery: 10
```

1. Rewrite the code uisng let in the same place where var is used gives  aruntime error that
```
ReferenceError: Cannot access 'mysteryVariableLet' before initialization
```
but when the variable init's are moved to the top of the scope we get this output
```
10
10
Inside revealMysteryLet: 20
After revealMysteryLet: 10
```
I expected the code to throw an error as let does not support hoisting and that is what happened, then after moving the declarations and initialisations to the top we get the proper output.

2. Then I got to more about let, which is let and const are hoisted but reside in a “temporal dead zone” until their definition line—accessing them early raises a ReferenceError.

