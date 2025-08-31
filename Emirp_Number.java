package codes;

public class Emirp_Number {
    public static void main(String[] args) {
        int num = 13, temp = num, ognum = num;
        boolean isNumPrime = true, isRevPrime = true;
        int rev = 0;
        int den = 2;

        // Check if original number is prime
        while (den <= num / 2) {
            if (num % den == 0) {
                isNumPrime = false;
                break;
            }
            den++;
        }

        if (!isNumPrime) {
            System.out.println(num + " is NOT PRIME");
            return;
        } else {
            System.out.println(num + " IS PRIME");
        }

        // Reverse the number
        while (temp != 0) {
            int last = temp % 10;
            rev = rev * 10 + last;
            temp /= 10;
        }

        // Check if reversed number is prime
        int den2 = 2;
        while (den2 <= rev / 2) {
            if (rev % den2 == 0) {
                isRevPrime = false;
                break;
            }
            den2++;
        }

        if (isRevPrime && rev != ognum) {
            System.out.println("EMIRP NUMBER");
        } else {
            System.out.println("NOT EMIRP NUMBER");
        }
    }
}
