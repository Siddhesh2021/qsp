package codes;

public class Fibo___num_in_fibo_or_not {

	public static void main(String[] args) {
	
		int n1=0, n2=1, ans =0,find=6;
		while(true){
			
			if(n1==find) {
				System.out.println("NUM FOUND");
				break;
			}
			if(n1>find) {
				System.out.println("NOT FOUND");
				break;
			}
			ans=n1+n2;
			n1=n2;
			n2=ans;
		}
		
		
			
		}
	}
