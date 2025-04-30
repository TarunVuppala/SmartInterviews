1. In the settimeout the function doesn't bind `this` to the objetc insted js refers this to the global object, so the name var is unavaliabe. It does not automatically refer to the user object.


2. Before entering the callback, we store the `this` (which is user) in self. The inner function closes over self, so it always refers to the object though its own this is lost.

3. Arrow fns lexically bind `this`. They inherit the `this` value from the surrounding scope, that surrounding scope is the `greetDelayed` method, whose `this` is bound to `user`. So at callback time, this === user.

4. 

```
const obj = {
    name: 'Alpha',
    task: function () {
        setTimeout(function () {
            console.log(`Processing: ${this.name}`);
        }, 1000);
    }
};
```

```
const obj = {
    name: 'Alpha',
    task: function () {
        setTimeout(() => {
            console.log(`Processing: ${this.name}`);
        }, 1000);
    }
};
```