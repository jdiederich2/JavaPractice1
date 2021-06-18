package jendiederich.SingleClassExpamles;

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
		Challenge.checkEnding("monthly", "mainly");
		Challenge.checkEnding("know", "know");
		System.out.println();
		
		
		//NumberPalindrome
		System.out.println("Number Palindrome");
		NumberPalindrome.isPalindrome(5421);
		NumberPalindrome.isPalindrome(5224);
		NumberPalindrome.isPalindrome(5225);
		System.out.println();
		
		
		//FirstLastDigitSum
		System.out.println("FirstLastDigitSum");
		FirstLastDigitSum.sumFirstAndLastDigit(563);
		FirstLastDigitSum.sumFirstAndLastDigit(-398);
		System.out.println();
		
		
		//EvenDigitSum
		System.out.println("EvenDigitSum");
		EvenDigitSum.getEvenDigitSum(135246);
		EvenDigitSum.getEvenDigitSum(-14);
		System.out.println();
		
		
		//SharedDigit
		System.out.println("SharedDigit");
		SharedDigit.hasSharedDigit(365, 257);
		SharedDigit.hasSharedDigit(87, 567);
		SharedDigit.hasSharedDigit(87, 67);
		SharedDigit.hasSharedDigit(12, 43);
		System.out.println();
		
		
		//LastDigitChecker
		System.out.println("LastDigitChecker");
		LastDigitChecker.hasSameLastDigit(467, 258, 982);
		LastDigitChecker.hasSameLastDigit(242, 452, 978);
		LastDigitChecker.hasSameLastDigit(1008, -1, 565);
		System.out.println();
		
		
		//GreatestCommonDivisor
		System.out.println("GreatestCommonDivisor");
		GreatestCommonDivisor.getGreatestCommonDivisor(35, 60);
		GreatestCommonDivisor.getGreatestCommonDivisor(7, 99);
		System.out.println();
		
		
		//FactorPrinter
		System.out.println("FactorPrinter");
		FactorPrinter.printFactors(750);
		FactorPrinter.printFactors(-6);
		System.out.println();
		
		
		//PerfectNumber
		System.out.println("PerfectNumber");
		PerfectNumber.isPerfectNumber(70);
		PerfectNumber.isPerfectNumber(-4);
		PerfectNumber.isPerfectNumber(11);
		PerfectNumber.isPerfectNumber(496);
		System.out.println();
		
		
		//NumberToWords
		System.out.println("NumberToWords");
		NumberToWords.numberToWords(200);
		NumberToWords.numberToWords(56);
		System.out.println();
		
		
		//FlourPacker
		System.out.println("FlourPacker");
		FlourPacker.canPack(15, 10, 50);
		FlourPacker.canPack(3, 1, 50);
		System.out.println();
		
		
		//LargestPrime
		System.out.println("LargestPrime");
		LargestPrime.getLargestPrime(500);
		LargestPrime.getLargestPrime(15);
		System.out.println();
		
		
		//PrintSquareStar
		System.out.println("PrintSquareStar");
		PrintSquareStar.printSquareStar(5);
		PrintSquareStar.printSquareStar(8);
		PrintSquareStar.printSquareStar(12);
		System.out.println();
		
		
		//InputCalculator
		System.out.println("InputCalculator");
		InputCalculator.inputThenPrintSumAndAverage();
		System.out.println();
		
		
		
		
	}	

}







































