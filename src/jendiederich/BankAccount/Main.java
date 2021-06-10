package jendiederich.BankAccount;

import jendiederich.BankAccount.BankAccount;
import jendiederich.BankAccount.VipCustomer;

public class Main {

	public static void main(String[] args) {

		BankAccount mine = new BankAccount(12345, 20.0, "Jen D", "jen@jen.com", "715-555-5555");
		
		mine.addFunds(20.00);
		mine.withdrawFunds(35.00);
		mine.withdrawFunds(15.00);

		mine.bankInfo();
		
		BankAccount jen = new BankAccount();
		
		BankAccount samsAccount = new BankAccount("Sam", "email@email.com", "123-456-7891");
		
		samsAccount.bankInfo();
		
		jen.addFunds(2000.00);
		System.out.println(jen.getBalance());
		
		BankAccount tom = new BankAccount();
		tom.bankInfo();
		
		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());
		
		VipCustomer person2 = new VipCustomer("Mike", 5000.00);
		System.out.println(person2.getName());
				
		VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmail());
		
	}

}
