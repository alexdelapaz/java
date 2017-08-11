import java.util.Scanner;

 public class InheritenceSuperClassBankAccount{

	private double balance;

/**
      Constructs a bank account with a zero balance.
*/
	public InheritenceSuperClassBankAccount(){   
      	balance = 0;
   	}

/**
	Makes a deposit into account
	@param amount the amount of the deposit
*/

	public void deposit(double amount){
	this.balance+=amount;
	}

/**
	Withdraw from account, 
	or charge penalry due to insufficient funds
	@param amount the withdrawal amount
*/

	public void withdraw(double amount){
	this.balance+=amount;
	}

/**
	End of month processing for account
*/
					//Does nothing in superclass
	public void monthEnd(){

	}

/**	Gets current balance of account
	@return the current balance
*/

	public double getBalance(){
	return balance;
	}
	
}//End class