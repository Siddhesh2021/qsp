package codes;

public class Sum_of_Prime_Digits_ina_num {
public static void main(String[] args) {
	int num=6789;
	int sum=0
		;
	while(num>0) {
		int last=num%10;
		
		int div=2;
		while(div<last) {
			if(last%div==0) {
				break;
			}
			if(last==div) {
				sum+=last;
			}
			div++;
			num/=10;
			
		}
				
	}
	System.out.println(sum);
}
}
