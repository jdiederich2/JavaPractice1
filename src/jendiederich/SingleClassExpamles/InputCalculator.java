package jendiederich.SingleClassExpamles;
import java.util.Scanner;


public class InputCalculator {
	
	public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        
        System.out.println("Please enter numbers. Press 'E' when finished.");
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            
            boolean isAnInt = sc.hasNextInt();
            
            if(isAnInt) {
                int number = sc.nextInt();
                count++;
                sum += number;
                
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(((double)sum/count)));
                 break;
            }
                sc.nextLine();
           
        }
        sc.close();
        
    }
}
