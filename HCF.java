package codes;

public class HCF {
	public static void main(String[] args) {
	int n1=100;
	int n2=10;
//	int small=n1<n2?n1:n2;
//	
//	while(true) {
//		if((n1%small)==0 && (n2%small)==0) {
//			System.out.println("HCF IS "
//					+ ""+small);
//		break;
//		}
//		small--;
//	}
	
//	EUCLIDAN ALGO
//	The Euclidean algorithm repeatedly subtracts the smaller number 
//	from the larger one until the two numbers become equal. 
//	The number they become equal to is the HCF.
	
	while(n1!=n2) {
		if(n1>n2) {
			n1=n1-n2;
		}
		else {
			n2=n2-n2;
		}
		}
	System.out.println(" HCF IS "+n1);
	
	
}
}