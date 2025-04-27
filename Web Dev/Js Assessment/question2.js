const items = [
    { name: "Alpha", process: function () { console.log(`Processing: ${this.name}`); } },
    { name: "Beta", process: function () { console.log(`Task for ${this.name} done.`); } }
];

function processObjectsDelayed(data, delay) {
    data.forEach((item, idx) => {
        setTimeout(() => {
            item.process();
            console.log(`Ran process with name: ${item.name}`);
        }, delay * (idx + 1));
    });
}



processObjectsDelayed(items, 3000);