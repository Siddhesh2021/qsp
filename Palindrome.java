package codes;

public class Palindrome {
public static void main(String[] args) {
	int num=1221;
	int rev=0;
	int temp=num;
	while(num!=0) {
		int digit=num%10;
		rev = rev*10+digit;
		num/=10;
	}
	if(temp==rev)
		System.out.println("PALI");
	else
		System.out.println("NOT PALI"+ "");

}

}
