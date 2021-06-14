package jendiederich.Validation;

public class ReverseDigits {
	
    public static int reverse(int number) {
        int digit = 0;
        int reverse = 0;
    
         while(number != 0) {
            digit = number % 10;
            number /= 10;
            reverse = reverse * 10 + digit;
        }
        
        //System.out.println(reverse);
        return(reverse);
    }
}
