package codes;

public class Power_of_Num {
public static void main(String[] args) {
	int num=3,
			 raise=3, ans=1;
	while(raise>0) {
		ans=ans*num;
		raise--;
	}
	System.out.println(ans);
}
}
