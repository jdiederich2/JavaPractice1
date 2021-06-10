package jendiederich.MinutesToYearsCalculator;

public class MinutesToYearsDaysCalculator {
	
	public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long XX = minutes;
            long days = ((XX / 60)/24);
            long ZZ = days % 365;
            long YY = days / 365;
            
            System.out.println(XX + " min = " + YY + " y and " + ZZ + " d");
        }
    }
}
