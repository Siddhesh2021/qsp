package codes;

public class V {
	public static void main(String[] args){    
	    int[] arr= {9,8,7,6,5,4,3,2,1};
	    int temp=0;
	    int low=-1;
	    int size=arr.length;
	    
	    for(int i=0;i<size-1;i++) {
	    	low=i;
	    	for(int j=i+1;j<size;j++) {
	    		if(arr[low]>arr[j]) {
	    			low=j;
	    			}
	    		}
	    	temp=arr[low];
			arr[low]=arr[i];
			arr[i]=temp;
	    }
	    for(int num:arr) {
	    	System.out.print(num+",");
	    }
}
}