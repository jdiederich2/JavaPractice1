package jendiederich.AreaCalculator;

public class AreaCalculator {
	
	private static double area;
	
	public static double area(double radius) {
        if(radius < 0) {
        	System.out.println("Invalid radius entered.");
            return -1.0;
        } else {
        	area = (radius * radius * Math.PI);
        	System.out.println("The area with a radius of " + radius + " is: " +  area);
            return area;
        }
    }
    
    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
        	System.out.println("Invalid numbers entered.");
            return -1.0;
        } else {
        	area = x * y;
        	System.out.println("The area of " + x + " and " + y + " is: " + area);
            return area;
        }
    } 
}
