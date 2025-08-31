package codes;

public class Prime {
public static void main(String[] args) {
	int num=40, fact=2;
	while(fact<=num/2) {
		if(num%fact==0) {
			
			break;
		}
		
		fact++;
	}
	if(fact>num/2)
		System.out.println(" PRIME");
	else
		System.out.println("NOT PRIME");
	
}
}
