package jendiederich.BankAccount;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	
	public BankAccount() {
		this(56789, 50.00, "Default name", "Default address", "Default phone");
		System.out.println(this.accountNumber + " " + this.balance);
		System.out.println("This is an empty constructor");
	}
	
	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		System.out.println("Account constructor with parameters was called.");
	}
	
	public BankAccount(String customerName, String email, String phoneNumber) {
		this(99999, 50.00, customerName, email, phoneNumber);
	}

	public void bankInfo() {
		System.out.println("Account number: " + this.accountNumber);
		System.out.println("Balance: " + this.balance);
		System.out.println("Account name: " + this.customerName);
		System.out.println("Balance: " + this.email);
		System.out.println("Balance: " + this.phoneNumber);
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void addFunds(double funds) {
		balance += funds;
		System.out.println("Your balance is: " + this.balance);
	}
	
	public void withdrawFunds(double funds) {
		if(balance < funds) {
			System.out.println("You do not have enough in your account. Your balance is: " + this.balance);
		} else {
			balance -= funds;
			System.out.println("Withdraw amount: " + funds + ". Your new balance is: " + this.balance);
		}		
		
	}	
	
}
