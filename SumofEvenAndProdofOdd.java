package codes;

public class SumofEvenAndProdofOdd {
	public static void main(String [] args) {
		int num=1239;
		int sum=0;
		int prod=1;
		
		while(num>0) {
			int last = num%10;
			if(last%2==0) 
				sum+=last;
			
			else
				prod*=last;
			
			num/=10;
		}
	
		
		
		System.out.println("sum is "+sum+" prod is "+prod);
	}
	
}
