package codes;

public class LCM {
public static void main(String[] args) {
	int n1=2;
	int n2=11;
	int i =1;
	int large=n1>n2?n1:n2;
	while(true) {
		if((large*i)%n1==0 && (large*i)%n2==0 ) {
			System.out.println("LCM IS "+(large*i));
			break;
		}
		
			i+=1;	
	}
}
}

//GPT LOGIC BY USING FORMULA
//package codes;
//
//public class LCM {
//    // Function to find GCD
//    public static int gcd(int a, int b) {
//        while(b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int n1 = 20, n2 = 11;
//        int gcd = gcd(n1, n2);
//        int lcm = (n1 * n2) / gcd;
//        System.out.println("LCM IS " + lcm);
//    }
//}


