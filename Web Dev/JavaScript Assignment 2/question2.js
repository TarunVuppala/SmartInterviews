/**
const user = {
    name: 'Alice',
    greetDelayed: function () {
        setTimeout(function () {
            console.log(`Hello, ${this.name}!`);
        }, 1000);
    }
};

user.greetDelayed(); // Expected: Hello, Alice! (after 1 second), Actual: ?
*/

/**
 * Fails
const obj = {
    name: 'Alpha',
    task: function () {
        setTimeout(function () {
            console.log(`Processing: ${this.name}`);
        }, 1000);
    }
};
 */

const obj = {
    name: 'Alpha',
    task: function () {
        setTimeout(() => {
            console.log(`Processing: ${this.name}`);
        }, 1000);
    }
};