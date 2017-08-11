import java.util.Scanner;

 public class InheritenceSubClassSavingsAccount extends InheritenceSuperClassBankAccount{

	private double interestRate;
	private double minBalance;

/**
	Constructs a InheritenceSubClassSavingsAccount
	with a zero balance
*/
	public InheritenceSubClassSavingsAccount(){

	}

/**
	Sets interest rate for account
	@param rate the interest rate
*/

	public void setInterestRate(double rate){

	}

/**
	Overrides withdraw from account method, 
	or charge penalry due to insufficient funds
	@param amount the withdrawal amount
*/

	public void withdraw(double amount){
	super.withdraw(amount);
	double balance = getBalance();
		if(balance<minBalance){
		minBalance=balance;
		}
	}

/**
	Overrides end of month processing for account
*/

	public void monthEnd(){
	double interest = minBalance*interestRate/100;
	deposit(interest);
	minBalance=getBalance();
	}


	
}//End class