
/*
// Linear search
let find_index = function(arr, target) {
   for(i = 0; i < arr.length; i = i + 1) {
      if(arr[i] === target) return i;
      else if(arr[i] > target) return i;
   }
   return -1;
}

let arr = [1, 2, 4, 6, 7, 9];
console.log(find_index(arr, 8))
*/

let find_index = function(arr, target) {
   let start = 0, end = arr.length - 1;
   
   while(start <= end) {
      let mid = Math.floor(start + (end - start) / 2);

      // If found target
      if(arr[mid] === target) return mid;
      else if(arr[mid] < target) start = mid + 1;
      else end = mid - 1;

   } 
   // Return position where the element can be
   return end + 1;
}

let arr = [1, 2, 4, 6, 7, 9];
console.log(find_index(arr, 8))
