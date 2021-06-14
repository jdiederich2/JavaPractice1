package jendiederich.SingleClassExpamles;

import jendiederich.Validation.NumberValidRange;

public class LastDigitChecker {
    
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        
        System.out.println(num1 + " : " + num2 + " : " + num3);
        
        if(NumberValidRange.isValid(num1, 10, 1000) && NumberValidRange.isValid(num2, 10, 1000) && NumberValidRange.isValid(num3, 10, 1000)) {
            
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;
            System.out.println(digit1 + " : " + digit2 + " : " + digit3);
            
            if(digit1 == digit2 || digit1 == digit3 || digit2 == digit3) {
                System.out.println("True");
            	return true;
            }
            System.out.println("False");    
            return false;
                
            }
        System.out.println("False");    
        return false;
        }
}
