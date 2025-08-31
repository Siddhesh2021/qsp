package codes;

public class ExtractDigits {
	public static void main(String args []) {
int num=1234;

//using while
//while(num>0) {
//	int last=num%10;
//	System.out.println(last);
//	num/=10;

//for(;num>0;num/=10) {
//	int last = num%10;
//	System.out.println(last);
//  }


//find digit in a num
//int find=4;
//for(;num>0;num/=10) {
//	int last=num%10;
//	
//	if(last==find) {
//		System.out.println("DIGIT FOUND");
//	break;
//	}
//	else {
//		System.out.println("NOT Found");
//	break;
//	}
//}


for(;num>0;num/=10) {
	int last=num%10;
	if(last%2==0)
		System.out.println("EVEN is "+last);
	else
		System.out.println("ODD  is "+last);
}

}
}