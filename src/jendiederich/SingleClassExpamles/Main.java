package jendiederich.SingleClassExpamles;

import jendiederich.Challenge.Challenge;
import jendiederich.SumOddRange.SumOddRange;

public class Main {

	public static void main(String[] args) {
		
		// IntEqualityPrinter
		System.out.println("IntEqualityPrinter");
		IntEqualityPrinter.printEqual(5, 5, 8);
		IntEqualityPrinter.printEqual(0, 5, 8);
		IntEqualityPrinter.printEqual(-1, 5, 8);
		IntEqualityPrinter.printEqual(5, 5, 5);
		System.out.println();
		
		
		//NumberInWord
		System.out.println("NumberInWord");
		NumberInWord.printNumberInWord(5);
		System.out.println();
		
		
		//NumberOfDaysInMonths
		System.out.println("NumberOfDaysInMonths");
		NumberOfDaysInMonth.getDaysInMonth(5, 2021);
		NumberOfDaysInMonth.isLeapYear(2020);
		System.out.println();
		
		
		//SumOddRange
		System.out.println("SumOddRange");
		SumOddRange.sumOdd(-5,20);
		SumOddRange.sumOdd(1, 20);
		System.out.println();
		
		
		//Challenge
		System.out.println("Challenge");
		Challenge.checkEnding("mean", "know");
		Challenge.checkEnding("monthly", "know");
	}

}
