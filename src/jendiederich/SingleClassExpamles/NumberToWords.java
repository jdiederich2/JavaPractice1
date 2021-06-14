package jendiederich.SingleClassExpamles;

import jendiederich.Validation.GetDigitCount;
import jendiederich.Validation.ReverseDigits;

public class NumberToWords {	

	public static void numberToWords(int number) {
        
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        
        int digit = 0;
        String word = "";
        String words = "";
        
        int initialCount = GetDigitCount.getDigitCount(number);
        //System.out.println("Your initial count is: " + initialCount);
        
        int reverse = ReverseDigits.reverse(number);
        //System.out.println(reverse);
        
        
        for(int i = initialCount; i > 0; i--) {
        
                digit = reverse % 10;
               // System.out.println("Switch digit is " + digit);
                switch (digit) {
                    case 0:
                        word = "Zero";
                        break;
                    case 1:
                        word = "One";
                        break;
                    case 2:
                        word = "Two";
                        break;
                    case 3:
                        word = "Three";
                        break;
                    case 4:
                        word = "Four";
                        break;
                    case 5:
                        word = "Five";
                        break;
                    case 6:
                        word = "Six";
                        break;
                    case 7:
                        word = "Seven";
                        break;
                    case 8:
                        word = "Eight";
                        break;
                    case 9:
                       word = "Nine";
                        break;    
                    case 10:
                       word = "Ten";
                        break;
                    default:
                        System.out.println("Not a Valid Number");
                    }
                    
                    words = words + word + " ";
                    reverse /= 10;
        }
        
                    System.out.println(words);
	}
		
}
