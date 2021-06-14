package jendiederich.SingleClassExpamles;

public class EvenDigitSum {
    
    public static int getEvenDigitSum(int number) {
        
        int sum = 0;
        
        if(number <= 0) {
        	System.out.println("Please enter a number greater than zero");
            return -1;
        }
        
        while(number != 0) {
            int digit = number % 10;
            number /= 10;
            
            if((digit % 2) == 0) {
                sum += digit;
            }
        }
        
        System.out.println("Sum is " + sum);
        return sum;
    }
}
