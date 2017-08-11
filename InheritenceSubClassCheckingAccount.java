import java.util.Scanner;

 public class InheritenceSubClassCheckingAccount extends InheritenceSuperClassBankAccount{

	private int withdrawals;

/**
	Constructs a InheritenceSubClassCheckingAccount
	with a zero balance
*/
	public InheritenceSubClassCheckingAccount(){

	}

/**
	Overrides withdraw from account method, 
	or charge penalry due to insufficient funds
	@param amount the withdrawal amount
*/

	public void withdraw(double amount){
	final int FREE_WITHDRAWALS=3;
	final int WITHDRAWAL_FEE=1;

	super.withdraw(amount);
	withdrawals++;
		if(withdrawals>FREE_WITHDRAWALS){
		super.withdraw(WITHDRAWAL_FEE);
		}
	}

/**
	Overrides end of month processing for account
*/

	public void monthEnd(){
	withdrawals=0;
	}

	
}//End class