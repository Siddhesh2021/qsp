package codes;
//Binary Search:
//Binary search is an efficient algorithm that works on a sorted array. 
//It repeatedly divides the search interval in half, 
//eliminating half the elements each time. Time complexity is O(logn).

import java.util.*;
public class III {
public static int search(int[] arr, int key) {
	int low=0, high=arr.length-1;
	
	while(low<=high) {
		int mid=(low+high)/2;
	if(arr[mid]==key) {
		return mid;
	}
	if(arr[mid]<key) {
		low=mid+1;
	}
	else {
		high=mid-1;
	}
	}
	return -1;
}
	public static void main(String [] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int key=6;
		int result=search(arr,key);
		
		if(result!=-1) {
			System.out.print("ELEMENT"+key+"FOUND AT"+result);
		}
		else {
			System.out.print("NOT FOUND");
		}
		
	}
}
