const products = [
    { name: 'Laptop', category: 'Electronics', price: 1200 },
    { name: 'T-Shirt', category: 'Apparel', price: 25 },
    { name: 'Mouse', category: 'Electronics', price: 30 },
    { name: 'Jeans', category: 'Apparel', price: 70 },
];

const groupByCategory = (products, categoryKey) => {
    let grouped = {};
    for (const product of products) {
        let category = product[categoryKey];
        if (!grouped[category]) {
            grouped[category] = [];
        }
        grouped[category].push(product);
    }
    return grouped;
}

console.log(groupByCategory(products, 'category'));