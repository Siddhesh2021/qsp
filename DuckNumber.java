package codes;

public class DuckNumber {
    public static void main(String[] args) {
        int num = 0107;
        int temp1=num;
        int temp = num;
        boolean isDuck = false;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                isDuck = true;
                break;
            }
            temp /= 10;
        }

        // To exclude numbers starting with 0 
        if (String.valueOf(num).charAt(0) == '0') {
        	System.out.println("1ST DIGIT ZERO");
            isDuck = false;
        }

        if (isDuck)
            System.out.println(temp1 + " is a Duck Number");
        else
            System.out.println(temp1+ " is NOT a Duck Number");
//    	int num=02177;
//    	boolean duck=false;
//    	int temp=num;
//    	while(temp>=0) {
//    		int first =temp/10;
//    		
//    		if(temp==0)
//    			System.out.println(" FIRST DIGIT CANT BE ZERO");
//    		break;
//    	}
//    	while(num>0) {
//    		int digit=num%10;
//    		if(digit==0) {
//    			duck=true;
//    		break;
//    		}
//    		else
//    			num/=10;
//    	}
//    	if(duck)
//    		System.out.println("num is duck");
//    	else
//    		System.out.println("NOT DUCK");
    	
    }
}
