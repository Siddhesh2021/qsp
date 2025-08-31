package codes;

public class Palindromic_fibinacci {
	public static void main(String[] args) {
		int num=121;
		int rev=0,temp=num;
		while(num>0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		System.out.println("rev is "+rev);
		if(temp==rev) {
			int n1=0,n2=1,ans=0;
			while(n1<=temp) {
				if(n1==temp) {
					System.out.println("pali&fibo");
				break;
				}
				
				ans=n1+n2;
				n1=n2;
				n2=ans;
			}
		}
		else {
			System.out.println("not");
		}
	}

}
