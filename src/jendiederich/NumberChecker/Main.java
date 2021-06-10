package jendiederich.NumberChecker;

public class Main {

	public static void main(String[] args) {
		
		TeenNumberChecker numbers = new TeenNumberChecker();

		numbers.hasTeen(5, 15, 7);
		numbers.hasTeen(6, 8, 2);
		numbers.isTeen(15);
		numbers.isTeen(5);
		
	}

}
