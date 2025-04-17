function currencyFormatter(amount, countryCode) {
    return new Intl.NumberFormat('en-IN', {
        style: 'currency',
        currency: countryCode,
    }).format(amount);
}

console.log(currencyFormatter(531230.50, 'INR'));
console.log(currencyFormatter(531230.50, 'USD'));
