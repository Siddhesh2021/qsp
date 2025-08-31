package codes;

public class AAAA_Practice {
public static void main(String[] args) {
	int num=145;
	int count=(int)Math.log10(num)+1;
	int sum=0;
	for(int i=1;i<=count;i++)
	{
		int last = num%10;
		int fact=1;
		for(int j=1; j<=last;j++)
		{
			fact=fact*j;
			
		}
		num/=10;
		sum+=fact;
	}
	System.out.println("ANS IS "+sum);
	}
}
