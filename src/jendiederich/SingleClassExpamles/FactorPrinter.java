package jendiederich.SingleClassExpamles;

import jendiederich.Validation.NumberValidRange;

public class FactorPrinter {
    
    public static void printFactors(int number) {
        
        int factor = 0; 
        
        NumberValidRange.isValid(number, 0, 1000);
        
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                factor = i;
                System.out.println(factor + "");
            }
        }
    }
}
