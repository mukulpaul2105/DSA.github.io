
/*
// Linear search

let arr = [1, 2, 3, 4, 6, 7];

for(i = 0; i < arr.length; i = i + 1) {
   if(arr[i + 1] - arr[i] > 1) {
      console.log(arr[i] + 1);
   }
}
*/

// Binary search

let findFirstMissing = function(array, start, end) {
    if (start != array[start])
        return start;

    let mid = Math.floor(start + (end - start) / 2);

    // Left half has all elements from 0 to mid
    if (array[mid] === mid)
        return findFirstMissing(array, mid + 1, end);

    return findFirstMissing(array, start, mid - 1); // It is working as else
}
 
let arr = [0, 1, 2, 3, 4, 5, 6, 7, 9, 10];
let start = 0;
let end = arr.length - 1;

console.log(findFirstMissing(arr, start, end));
