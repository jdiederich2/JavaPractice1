package jendiederich.Validation;

public class GetDigitCount {
	
    public static int getDigitCount(int number) {
        
        int count = 0;
        
        if(number < 0) {
            return -1;
        }
        
        if(number == 0) {
            return 1;
        }
        
        while(number != 0) {
            number = number / 10;
            ++count;
        }
        
        //System.out.println("Your count is: " + count);
        return count;
    }	
}
