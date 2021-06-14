package jendiederich.SingleClassExpamles;

public class SharedDigit {
    
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            System.out.println("Invalid: Please enter a number between 10 and 99");
        	return false;
        }
        
        while(num1 != 0) {
            //System.out.println("Num1: " + num1);
            int digit = num1 % 10;
            //System.out.println("Digit1: " + digit);
            //System.out.println();
            
            int number2 = num2;
            //System.out.println("Num2: " + number2);
            
            while(number2 != 0) {
                
                int digit2 = number2 % 10;
                //System.out.println("Second while loop digit: " + digit2);
                
                if(digit == digit2) {
                    //System.out.println("Digit1: " + digit + ", digit2: " + digit2);
                    System.out.println("True");
                    return true;
                } 
                number2 /= 10;
                
                
            }
            num1 /= 10;
            
        }
        
        System.out.println("False");
        return false;
    }
}
