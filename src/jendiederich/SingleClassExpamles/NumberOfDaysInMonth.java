package jendiederich.SingleClassExpamles;

public class NumberOfDaysInMonth {

	public static boolean isLeapYear(int year) {
        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            	System.out.println("True: " + year + " is a leap year");
                return true;
            }
        }
    	System.out.println("False: " + year + " is not a leap year");
        return false;
    }
    
    public static int getDaysInMonth(int month, int year) {
        if(year < 1 || year > 9999) {
        	System.out.println("False");
            return -1;
        }
        
        if(month < 1 || month > 12) {
        	System.out.println("False");
            return -1;
        }
   
   
        int days = 0;
        
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
            	System.out.println("The number of days in month " + month + " is: " + days);
                break;
                
            case 2:
                if(isLeapYear(year)) {                	
                    days = 29;
                    System.out.println("The number of days in month "  + month + " is: " + days);
                    break;
                } else {
                    days = 28;
                	System.out.println("The number of days in month " + month + " is: " + days);
                }
                break;
           
            case 4: case 6: case 9: case 11:
                days = 30;
            	System.out.println("The number of days in month " + month + " is: " + days);
                break;
                
            default:
                days = 31;
            	System.out.println("The number of days in month " + month + " is: " + days);
                break;
        }
        
        return days;
    }
}
