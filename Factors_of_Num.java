package codes;

public class Factors_of_Num {
public static void main(String[] args) {
	int num=12;
	int fact=1;
	while(fact<=num/2) {
		if(num%fact==0) {
			System.out.println(" fact is "+fact);
		
		}
		fact++;
	}
System.out.println(num);
}
}
