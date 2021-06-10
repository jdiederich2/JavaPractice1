package jendiederich.NumberChecker;

public class TeenNumberChecker {
	 
    public boolean hasTeen(int a, int b, int c) {
        int[] nums = { a, b, c }; 

        for(int num : nums) {
            if(num >= 13 && num <= 19) {
                System.out.println("True");
                return true;
            }
            
        }
        System.out.println("False");
        return false;
    }
    
    public boolean isTeen(int a) {
        if(a >= 13 && a <= 19) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
