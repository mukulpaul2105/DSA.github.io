
/*
let lower_bound = function(arr, target, flag) {

   let result = -1;
   let low = 0, high = arr.length - 1;

   while(low <= high) {

      let mid = Math.floor((low + high) / 2);

      if(arr[mid] === target) {
         result = mid;
         if(flag === true) {
            high = mid - 1;
         }
      }
      else if(arr[mid] < target) {
         low = mid + 1;
      } else
         high = mid - 1;
   }
   return result;
}

let arr = [1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8];
let target = 6;
console.log(lower_bound(arr, target, true));
*/

// Finding Higher bound or last occurance

let upper_bound = function(arr, target, flag) {

   let result = -1;
   let low = 0, high = arr.length - 1;

   while(low <= high) {
      mid = Math.floor((low + high) / 2);

       // We got the answer but storing it in tmp 
         // var furthur investigation
      if(arr[mid] === target) {
         result = mid;
         
         // This step is for furthur investigation
         if(flag === true) {
            low = mid + 1;
         }
      } else if(arr[mid] < target) {
         low = mid + 1;
      } else 
         high = mid - 1;
   }
   return result;
}

let arr = [1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8];
let target = 3;
console.log(upper_bound(arr, target, true));