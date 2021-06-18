package jendiederich.Person;

public class Person {

    private String firstName;
    private String lastName;
    private int age; 
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setFirstName(String fName) {
        firstName = fName;
    }
    
    public void setLastName(String lName) {
        lastName = lName;
    }
    
    public void setAge(int yourAge) {
        if(yourAge < 0 || yourAge > 100) {
            age = 0;
        } else {
           age = yourAge; 
        }
    }
    
    public boolean isTeen() {
        if(age <= 12 || age >= 20) {
            return false;
        }
        return true;
    }
    
    public String getFullName() {
        if(firstName == null && lastName == null) {
           return "";
        } else if(lastName.isEmpty()) {
             return firstName;
        } else if(firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }	
}
