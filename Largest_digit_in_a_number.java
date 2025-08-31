package codes;

public class Largest_digit_in_a_number {
public static void main(String[] args) {
	int num=984567;
	int max=Integer.MIN_VALUE;
	
	while(num>0) {
		int last=num%10;
//		if(last>max) {
//			max=last;
//		}	
		
		//max=last>max?last:max;
		max=Math.max(max, last);
		num/=10;
	}
	System.out.println("LARGEST DIGIT IN THE NUMBER IS "+max);
}
}
