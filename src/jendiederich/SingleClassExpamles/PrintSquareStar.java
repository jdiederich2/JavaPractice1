package jendiederich.SingleClassExpamles;

public class PrintSquareStar {
	
	static void printSquareStar(int number) {

        if(number >= 5) {
        	
            for(int i = 1; i <= number; i++) {
            	
                for(int j = 1; j <= number; j++) {
                	
                    if(j == 1 || j == number || j == i) {
                        System.out.print("*");
                    } else if (j == ((number - i) + 1)) {
                        System.out.print("*");
                    } else if (i == 1 || i == number) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                   System.out.println(" ");
            }
            
        } else {
            System.out.println("Invalid Value");
        }
    }
}
