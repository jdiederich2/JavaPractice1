package jendiederich.SingleClassExpamles;

import jendiederich.Validation.NumberValidRange;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        
        int num = 0;
        
        if(NumberValidRange.isValid(first, 10, 1000) || NumberValidRange.isValid(second, 10, 1000)) {
        	System.out.println("");
            return -1;
        } 
            
		for(int i = 1; i <= first; i++) {
			if(first % i == 0 && second % i == 0) {
				num = i;
			}

		} 
		
		System.out.println(num);
		return num;
    } 
    
}
