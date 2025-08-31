package codes;

public class Neon_Num {
	public static void main(String[] args) {
		int num=81
				; 
		int sqr=num*num;
		int sum=0;
		
		while(sqr>0) {
			sum+=sqr%10;
			sqr/=10;
		}
		
		if(sum==num)
			System.out.println("NEON");
		else
			System.out.println("NOT NEON");
	}
}
