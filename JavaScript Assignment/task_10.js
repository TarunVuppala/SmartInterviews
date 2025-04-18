const processTransactions = (transactions) => {
    let amt = 0;
    let withdrawnAmount = 0;
    let depositedAmount = 0;
    for (let transaction of transactions) {
        if (transaction.type == "withdraw") {
            withdrawnAmount += transaction.amount;
        }
        if (transaction.type == "deposit") {
            depositedAmount += transaction.amount;
        }
    }
    return { totalAmount: amt, totalwithdrawnAmount: withdrawnAmount, totaldepositedAmount: depositedAmount };
};

const transactions = [
    { type: "deposit", amount: 200 },
    { type: "withdraw", amount: 10 },
    { type: "withdraw", amount: 50 },
    { type: "deposit", amount: 300 },
];

console.log(processTransactions(transactions));