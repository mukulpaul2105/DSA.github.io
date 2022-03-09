


let binarysearch = function (arr, x) {
   let start = 0, end = arr.length - 1;

   // Iterate while start not meets end
   while(start <= end) {

      // Find the mid index
      let mid = Math.floor( start + (end - start) / 2);

      // If element is present at mid, return True
      if(arr[mid] === x) return mid;

      // Else look in left or right half accordingly
      else if(arr[mid] < x) 
      start = mid + 1;

      else 
      end = mid - 1;
   }
   return -1; // -1 because if elemnet not detected than we
   // -1 we can use to indicate using another if condition
   // at the 2nd last line that element is not found
}


let arr = [1, 2, 4, 5, 6, 6, 7, 8, 9];
let result = binarysearch(arr, 7);

if(result == -1) {
   console.log("Does not contain the element");
} else {
   console.log(result);
}

