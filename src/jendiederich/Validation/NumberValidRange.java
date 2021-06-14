package jendiederich.Validation;

public class NumberValidRange {
    
	public static boolean isValid(int num, int low, int high) {
	    if(num <= low || num >= high) {
	        System.out.println("Your number is not valid: " + num);
	        return true;	        
	    }

        System.out.println("Number " + num + " is valid");
        return false;
	}
}
