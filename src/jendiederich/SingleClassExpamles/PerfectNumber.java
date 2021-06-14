package jendiederich.SingleClassExpamles;

import jendiederich.Validation.NumberValidRange;

public class PerfectNumber {
	
    public static boolean isPerfectNumber(int number) {
        
        int properDivisor = 0;
        int sum = 0;
    
        NumberValidRange.isValid(number, 1, 1000);
        
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                properDivisor = i;
                System.out.println(properDivisor + "");
                sum += i; 
            }
        }
                
        if(sum == number) {
        	System.out.println("True");
            return true;
        } 
        
        System.out.println("False \n");
        return false;        
    } 
}
