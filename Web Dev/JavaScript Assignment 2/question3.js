//2)

function createGreeting(greeting) {
    return function (name) {
        return `${greeting}, ${name}!`;
    };
}

const greet = createGreeting("Hello");
console.log(sayHello("World"));

const greet1 = createGreeting("Konichiwa");
console.log(sayHello("World"));

// 3,4)

function createSecretHolder(initialSecret) {
    let secret = initialSecret;
    const getSecret = () => {
        return secret;
    }
    const setSecret = (newSecret) => {
        secret = newSecret;
    }
    return {
        getSecret,
        setSecret
    };
}

const secret = createSecretHolder("...");
console.log(secret.getSecret());
secret.setSecret("dont tell");
console.log(secret.getSecret());
// console.log(secret.secret); //wont work as secret is private
// No one can `access` the secret variable except the methods.
