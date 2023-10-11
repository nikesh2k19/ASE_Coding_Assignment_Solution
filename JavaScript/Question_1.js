/* 1. Take a sentence as an input and reverse every word in that sentence. Example - This is a sunny
day > shiT si a ynnus yad. */

function reverseWords(sentence) {
    // Split the sentence into an array of words
    let wordsArray = sentence.split(" ");
    // Reverse each word in the array
    let reversedWordsArray = wordsArray.map(word => reverseString(word));
    // Join the reversed words back into a sentence
    let reversedSentence = reversedWordsArray.join(" ");
    return reversedSentence;
}

function reverseString(str) {
    // Convert the string into an array of characters, reverse it, and join it back into a string
    return str.split("").reverse().join("");
}
// Example usage
let inputSentence = prompt("Enter a sentence:"); // You can use a prompt for interactive input
let reversedSentence = reverseWords(inputSentence);
console.log("Reversed Sentence:", reversedSentence);