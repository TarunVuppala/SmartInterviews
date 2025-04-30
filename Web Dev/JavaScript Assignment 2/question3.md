1. Closure is a function (when there is a function defined inside a function) that happens to have the outer scope variable's access to it, even if we are just making a call to the inner function.

In here,
```
function setupCounter(initialValue) {
  let count = initialValue;
  function increment() {
    count++;
    return count;
  }
  function decrement() {
    count--;
    return count;
  }
  return { increment, decrement };
}
```
everytime the setupcounter is called it allocates a new memoey spave to `count` var, and the returned `increment` and `decrement` functions have its outer score var's with it, so they are closures, and they operate on that variavle count.
