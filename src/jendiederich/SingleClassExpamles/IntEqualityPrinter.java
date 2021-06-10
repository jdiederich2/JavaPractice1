package jendiederich.SingleClassExpamles;

public class IntEqualityPrinter {
	
	public static void printEqual(int a, int b, int c) {
        if(a < 0 || b < 0 || c < 0) {
        	results(a, b, c);
            System.out.println("Invalid Value");
        } else if(a == b && b == c) {
        	results(a, b, c);
            System.out.println("All numbers are equal");
        } else if(a != b && b != c && a != c) {
        	results(a, b, c);
            System.out.println("All numbers are different");
        } else {
        	results(a, b, c);
            System.out.println("Neither, not all are equal or different");
        }
    }
	
	public static void results(int a, int b, int c) {
		System.out.println("a = " + a);
    	System.out.println("b = " + b);
    	System.out.println("c = " + c);
	}
}
