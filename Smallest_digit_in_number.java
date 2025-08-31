package codes;

public class Smallest_digit_in_number {
public static void main(String[] args) {
	int num=6257;
	int min=Integer.MAX_VALUE;
	
	while(num>0) {
		int last = num%10;
//		if(last<min) {
//			min=last;
//		}
	
		//instead of if statment above we can also write, either of below statementsq
//		min=last<min?last:min;
//		min=Math.min(last, min);
		num/=10;
	}
	
	
	System.out.println(" Smallest digit is:" +min);
	
}
}
