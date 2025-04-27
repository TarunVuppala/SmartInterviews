const data = { a: "short", b: "longer string", c: 123, d: "very long string indeed",key:"as"};
const filtered = filterObjectProperties(data, 6);
console.log(filtered);

function filterObjectProperties(obj, maxLength) {
    const res = {};
    for (const key in obj) {
        if (obj[key].length >= maxLength) {
            console.log(obj.key);
            console.log(obj[key]);
            
            res[key] = obj[key];
        }
    }
    return res;
}