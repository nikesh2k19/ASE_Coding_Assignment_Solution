// 2. Perform sorting of an array in descending order.


// Function to perform descending order sorting
function sortArrayDescending(arr) {
return arr.sort(function(a, b) {
// Compare b with a to sort in descending order
return b - a;
});
}
// Example usage
let inputArray = [5, 2, 8, 1, 4];
let sortedArray = sortArrayDescending(inputArray);
console.log("Sorted Array (Descending):", sortedArray);
