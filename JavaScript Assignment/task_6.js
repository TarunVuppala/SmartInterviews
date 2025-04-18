function createCalculator() {
    const calc = {
        add(a, b) {
            return a + b;
        },
        subtract(a, b) {
            return a - b;
        },
        multiply(a, b) {
            return a * b;
        },
        divide(a, b) {
            return a / b;
        }
    }
    return calc;
}

const calculator = createCalculator();
console.log(calculator.add(11, 21));