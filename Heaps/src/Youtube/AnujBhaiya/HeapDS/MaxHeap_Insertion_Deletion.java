package Youtube.AnujBhaiya.HeapDS;

public class MaxHeap_Insertion_Deletion {
	
	private static void swap(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}

	private static void insertion(int[] arr, int n, int val) {
		n++;
		arr[n] = val;
		int i = n;
		while(i > 0) {
			int parent = i / 2;
			if(arr[parent] < arr[i]) {
				swap(arr, parent, i);
				i = parent;
			}
		}
	}
	
	private static void delete(int[] arr, int n) {
		arr[0] = arr[n - 1];
		n = n - 1;
		int i = 1;
		while(i < n) {
			int left = arr[2 * i];
			int right = arr[2 * i + 1];
			int larger =(left > right) ? left : right;
			if(arr[i] < arr[larger]) {
				swap(arr, i, larger);
				i = larger;
			} else return;
		}
		
	}
	
	private static void print(int[] arr) {
		for(int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		arr[0] = 50;
		arr[1] = 30;
		arr[2] = 40;
		arr[3] = 10;
		arr[4] = 5;
		arr[5] = 20;
		arr[6] = 30;
		
//		int val = 60;
//		insertion(arr, 6, val);
		
//		insertion(list, list.size() - 1, 45);
		print(arr);
		insertion(arr, 6, 60);
		print(arr);

		delete(arr, 8);
		print(arr);
		
	}
}
