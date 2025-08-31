package codes;

public class ArmStrong {
public static void main(String[] args) {
	int num=1634;
	int prod=1, sum=0,count=0,temp=num; 
	int ognum=num;
	
	while(temp>0) {
		 temp/=10;
		 count++;
	System.out.println("count is "+count);
		 
	}
	while(num>0) {
		int last=num%10;
		prod=1;
		for(int i=1; i<=count;i++) {
			prod*=last;
		}
		sum+=prod;
		num/=10;	
	}
	if(sum==ognum)
		System.out.println("ARMS");
	else
		System.out.println("NOT");
	
	
//			int num = 153;
//	        int count = 0;
//	        int temp = num;
//	        int originalNum = num;
//	        int sum = 0;
//
//	        // Count the number of digits
//	        while (temp > 0) {
//	            temp /= 10;
//	            count++;
//	        }
//
//	        temp = num; // reset temp to the original number
//
//	        // Calculate the sum of digits raised to the power of count
//	        while (temp > 0) {
//	            int digit = temp % 10;
//	            int prod = 1;
//
//	            // Raise digit to the power of count
//	            for (int i = 0; i < count; i++) {
//	                prod *= digit;
//	            }
//
//	            sum += prod;
//	            temp /= 10;
//	        }
//
//	        if (sum == originalNum)
//	            System.out.println("ARMS");
//	        else
//	            System.out.println("NOT");
	    

}
}
