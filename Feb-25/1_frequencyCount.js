
let frequencyCount = function(arr, target, flag) {

   let low = 0, high = arr.length - 1;
   let result = -1;

   while(low <= high) {
      let mid = Math.floor(low + (high - low) / 2);
      
      if(arr[mid] === target ) {
         result = mid;

         if(flag === true) {
            low = mid + 1;

         } else high = mid - 1;

      } else if(arr[mid] < target) {
         low = mid + 1;

      } else high = mid - 1;

   }
   return result;
}

let arr = [1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9];

let target = 5;

let lower_index = frequencyCount(arr, target, false);
let upper_index = frequencyCount(arr, target, true);

console.log(upper_index - lower_index + 1);