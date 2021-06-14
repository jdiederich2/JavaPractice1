package jendiederich.SingleClassExpamles;

public class NumberPalindrome {
	
    public static boolean isPalindrome(int number) {
        int originalNum = number;
        
        int reverse = 0;
        
        while(number != 0) {
            int digit = number % 10;
            number /= 10;
            reverse = reverse * 10 + digit;
        }
        
        if(originalNum == reverse) {
        	System.out.println("True: Number " + originalNum + " reversed is " + reverse);
            return true;
        }
        
        System.out.println("False: number " + reverse + " is not the same as " + originalNum);
        return false;

    }

}
