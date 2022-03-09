
let search_z = function(arr, target) {
   let start = 0; end = arr.length - 1;

   while(start <= end) {
      let mid = Math.floor(start + (end - start) / 2);
      if(arr[mid] === target) return mid;
      else if(arr[mid] < target) start = mid + 1;
      else end = mid -1;
   } return - 1;
}

let arr = ['a','b','d','e','f','g','h','i','x','z'];
let target = "z";

console.log(search_z(arr, target));