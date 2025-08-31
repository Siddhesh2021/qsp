package codes;
//genious vaibhav sir program
public class coprime {
public static void main(String[] args) {
	int n1=5, n2=10;
	int small=n1<n2?n1:n2;
	int hcf=0;
	while(true) {
		if(n1%small==0 && n2%small==0) {
			
			break;
		}
		
		small--;
	}
		if(small==1)
			System.out.println("COPRIME");
		else
			System.out.println("NOT");
		
	}
}

