import java.util.Scanner;
class SavingAccount
{
	static double annualInterestRate;
	private double savingBalance;
	private double savingBalance1;
	SavingAccount()
	{
		savingBalance=0.0;
	}
	SavingAccount(double savingBalance)
	{
		this.savingBalance=savingBalance;
	}
	static void setInterest(double interest)
	{
		annualInterestRate=interest;
	}
	void setSavingBalance(double savingBalance)
	{
		this.savingBalance=savingBalance;
	}
	void calculateMonthlyInterest()	
	{
		double interestRate=savingBalance*annualInterestRate/12;
		savingBalance1=savingBalance+interestRate;	
	}
	static void modifyInterestRate(double interest)
	{
		annualInterestRate=interest;
	}
	void display()
	{
		System.out.println("annualInterestRate = "+annualInterestRate);
		System.out.println("savingBalance = "+savingBalance);
		System.out.println("SavingBalance with interest = "+savingBalance1);
	}
}
class SavingAccountTest
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the interest rate for bank:");
		double interest=sc.nextDouble();
		SavingAccount.setInterest(interest);
		SavingAccount saver1=new SavingAccount();
		System.out.println("Enter the bank balance of Saver1:");
		double balance=sc.nextDouble();
		saver1.setSavingBalance(balance);		
		saver1.calculateMonthlyInterest();
		System.out.println("\nSaver1 before modification");
		saver1.display();
		SavingAccount saver2=new SavingAccount();
		System.out.println("\nEnter the bank balance of Saver2:");
		balance=sc.nextDouble();
		saver2.setSavingBalance(balance);		
		saver2.calculateMonthlyInterest();
		System.out.println("\nSaver2 before modification");
		saver2.display();
		System.out.println("\nEnter the new interest rate for bank:");
		interest=sc.nextDouble();
		SavingAccount.modifyInterestRate(interest);
		saver1.calculateMonthlyInterest();
		System.out.println("\nSaver1 after modification");
		saver1.display();
		saver2.calculateMonthlyInterest();
		System.out.println("\nSaver2 after modification");
		saver2.display();
	}
}