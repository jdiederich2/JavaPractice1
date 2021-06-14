package jendiederich.SingleClassExpamles;

public class FirstLastDigitSum {
    
    public static int sumFirstAndLastDigit(int number) {
        
        if(number <0) {
        	System.out.println("Invalid number entered.");
            return -1;
        }
        
        int reverse = 0;
        int lastNum = number % 10;
        
        
        while(number != 0) {
            int digit = number % 10;
            number /= 10;
            reverse = reverse * 10 + digit;
        }
        
        int firstNum = reverse % 10;
        int sum = firstNum + lastNum;
        
        System.out.println("Sum is " + sum);
        return(sum);
        
    }
}
