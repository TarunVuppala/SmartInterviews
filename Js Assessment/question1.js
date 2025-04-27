function createUniqueCounter() {
    let c = 0;
    function increment() {
        c++;
        console.log(`Incremented to ${c}`);
    }
    function getValue() {
        console.log(`Counter value: ${c}`);
    }
    return { increment, getValue };
}

const counter = createUniqueCounter();
counter.increment();
counter.increment();
counter.getValue();
const counter2 = createUniqueCounter();
counter2.increment();
counter.getValue()