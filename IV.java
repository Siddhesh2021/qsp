package codes;
import java.util.*;
class IV{
	public static void main(String[] args){    
    int[] arr= {8,65,5,3,2,1,324};
    int temp=0,flag=1;
    for(int i=1;i<arr.length && flag==1;i++) {
    	flag=1;
    	for(int j=0;j<arr.length-i;j++) {
    		if(arr[j]>arr[j+1]) {
    			temp=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=temp;
    			
    		}
    	}
    }
    for(int num:arr) {
    System.out.print(num+",");
    }
}
}
