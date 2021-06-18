package jendiederich.SingleClassExpamles;

public class LargestPrime {
	public static int getLargestPrime(int number) {
        
        int factor = 0;
        int largestFactor = 0;
        int primeFactor = 0;
        
        if(number < 2) {
            return -1;
        }
        
        for(int i = 1; i <= number; i++) {
            
            int divisor = 0;
            int j = 1;

            if(number % i == 0) {
                factor = i;
                
                while(j <= factor) {                
                    
                    if(factor % j == 0) {
                        divisor++;
                    }                    
                    j++;
                    
                }
                j=1;
            }            
            
            if(divisor == 2) {
                primeFactor = factor;
            }
            
            if(primeFactor > largestFactor) {
                largestFactor = primeFactor;
            }
        }
        
        System.out.println("The largestFactor is: " + largestFactor);
        return largestFactor;
    }
	
}
