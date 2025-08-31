package codes;
import java.util.Scanner;
class HappyNumber{
	
	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num");
			
		int num=sc.nextInt();
	
		int sum=0;
		
		do {
		sum=0;
			while(num>0) {
				int last=num%10;
				sum=sum+(last*last);
				num/=10;
				
			}
			num=sum;
		}while(sum>=10);
		
		if(sum==1)
			System.out.println("Its is a happy number");
		else
			System.out.println("Its not a happy number");
		
		
	}
}