package codes;
import java.util.*;
public class PasswordUsingDoWhile {
	public static void main(String args []) {
	int pwd=1234;
	int userpwd;
	int attempt=0;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
		do {
			System.out.println("Enter Password");
			userpwd=sc.nextInt();
		
			if(pwd==userpwd) {	
				System.out.println("password is right");
				break;
			}
			else{
				attempt++;			
			}
		}while(attempt<3);
	if(attempt==3)
		System.out.println("Max no. of attempts reached");
	}
}
