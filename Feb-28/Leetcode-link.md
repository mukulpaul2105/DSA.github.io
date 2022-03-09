//  https://leetcode.com/problems/sort-colors/submissions/

var sortColors = function(arr) {
   let start = 0, end = arr.length - 1;
   
   for(let i = 0; i <= end; i++) {
      if(arr[i] === 0) {
         let tempvar = arr[i];
         arr[i] = arr[start];
         arr[start] = tempvar;
         start++ ;

      }
      else if(arr[i] === 2) {
         let tempvar = arr[i];
         arr[i] = arr[end];
         arr[end] = tempvar;
         end-- ; 
         i--;
      }
   }

   return arr;
};
