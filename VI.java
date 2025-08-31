package codes;
public class VI {
	
	
		public static void main(String[] args){    
		    int[] arr= {9,8,7,6,5,4,3,2,1};
		    int key;
		    for(int i=1;i<arr.length;i++) {
		    	key=arr[i];
		    	int j =i - 1;
		    	for (; j >= 0 && arr[j] > key; j--) {
		    		arr[j+1]=arr[j];
		    		 
		    	}
		    	arr[j+1]=key;
		    }
		    for(int num:arr) {
		    	System.out.print(num+",");
		    }
	}
	}

	
	
	
	/*
	  public static void main(String[] args) {
	  int[] arr = {12, 11, 13, 5, 6};
	  insertionSort(arr);
	  
	  System.out.println("Sorted array:"); 
	  for (int i : arr) { 
	  System.out.print(i + " "); } }
	  
	  public static void insertionSort(int[] arr) { 
	  int n = arr.length;
	  
	  // Outer loop to iterate over each element starting from index 1 
	  for (int i = 1; i < n; i++) { 
	  int key = arr[i]; 
	  // Current element to be inserted 
	  int j =i - 1;
	  
	  // Inner loop to shift elements of the sorted section 
	  for (; j >= 0 && arr[j] > key; j--) { 
	  arr[j + 1] = arr[j]; 
	  // Shift the larger element to the right }
	 
	  // Insert the key element at the correct position 
	  arr[j + 1] = key; 
	 } 
	 }
*/

