package Medium;
/*
 *  Also known as
 *  RGB problem or
 *  Dutch flag problems1
 */

public class SortColors75 {
	
	public static void sortColor(int[] arr) {
        int low = 0, high = arr.length - 1, current = 0, temp;
        
        while(low <= high) {
        	if(arr[current] == 0) {
            	temp = arr[current];
            	arr[current] = arr[low];
            	arr[low] = temp;
            	low++;
            	current++;
            } else if(arr[current] == 1) {
            	temp = arr[current];
            	arr[current] = arr[high];
            	arr[high] = temp;
            	high--;
            } else {
            	current++;
            } 
        }
        
    }
	/*
	 *  Or
	 */
	
	public static void sortColors(int[] arr) {
        
		int start = 0, end = arr.length - 1;
		   
		   for(int i = 0; i <= end; i++) {
		      if(arr[i] == 0) {
		         int tempvar = arr[i];
		         arr[i] = arr[start];
		         arr[start] = tempvar;
		         start++ ;

		      }
		      else if(arr[i] == 2) {
		         int tempvar = arr[i];
		         arr[i] = arr[end];
		         arr[end] = tempvar;
		         end-- ; 
		         i--;
		      }
		   }
	}
	
	public static void print(int[] arr) {
		for(var i : arr) {
			System.out.print(i + ", ");
		}
	}
	
	public static void partitionArr(int[] arr, int n){
        int left = 0, current = 0, end = n - 1;
        while(current <= end){
            if(arr[current]==1){
                current++;
            }else if(arr[current] == 0){
                int temp = arr[current];
                arr[current] = arr[left];
                arr[left] = temp;
                left++;
                current++;
            }else{
                int temp = arr[end];
                arr[end] = arr[current];
                arr[current] = temp;
                end--;
            }
        }
	
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0, 1, 0, 2, 2, 1, 0};
		sortColors(nums);
		print(nums);
	}

}
