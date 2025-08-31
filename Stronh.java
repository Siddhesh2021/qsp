package codes;

public class Stronh {
public static void main(String[] args) {
	int num=145;
	 int temp=num;
	int sum=0;
	while(num>0) {
		int last =num%10;
		int fact=1;
	for(int i=1;i<=last;i++) {
		fact=fact*i;
		}
	sum=sum+fact;
	num/=10;
	}
		if(temp==sum) {
		System.out.println("STTORMG");
		}
		else
			System.out.println("NOT STORNG");
	}
}
