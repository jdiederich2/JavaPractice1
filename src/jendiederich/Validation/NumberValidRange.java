package jendiederich.Validation;

public class NumberValidRange {
    
	public static boolean isValid(int num, int low, int high) {
	    if(num <= low || num >= high) {
	        System.out.println("Number " + num + " is not valid.");
	        return true;	        
	    }

        System.out.println("Number " + num + " is valid");
        return false;
	}
}
