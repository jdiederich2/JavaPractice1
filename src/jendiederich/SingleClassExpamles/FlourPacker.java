package jendiederich.SingleClassExpamles;

import jendiederich.Validation.NumberValidRange;

public class FlourPacker {
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        int bcKilo = bigCount * 5;

        if(NumberValidRange.isValid(bigCount, 0, 1000) || NumberValidRange.isValid(smallCount, 0, 1000) || NumberValidRange.isValid(goal, 0, 1000)) {
        	System.out.println("False");
            return false;
        }
        
        
        if(smallCount >= goal) {
            System.out.println("True");
            return true;
        }
        
        if(bigCount > 0) {
            
            if(goal >= bcKilo) {
                int remainder = goal - bcKilo;
            
                if(smallCount >= remainder) {
                    System.out.println("True");
                   return true;
                }
                
            } else {
             
                int remainder = goal % 5;
                
                if(remainder <= smallCount) {
                    System.out.println("true");
                    return true;
                }
            }
        }
        
        System.out.println("False");
        return false;
    }
}
