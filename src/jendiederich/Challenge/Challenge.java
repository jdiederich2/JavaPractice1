package jendiederich.Challenge;

public class Challenge {
	  public static boolean checkEnding(String str1, String str2) {
		  
		int str2Length = str2.length();
		int str1Length = str1.length();
		int str1Start = str1Length - str2Length;
	
		System.out.println("String 2 Length: " + str2Length);
		System.out.println("String 1 Length: " + str1Length);
		System.out.println("String 1 Start: " + str1Start);
		System.out.println("String 1 End: " + str1Length);
	
		String subString = str1.substring(str1Start, str1Length);
	
		if(subString.equals(str2)) {
			System.out.println("String 2: " + str2 + ", String 1: " + subString + ". These 2 are equal.");
			return true;
		}
	
		return false;
	  }
}
