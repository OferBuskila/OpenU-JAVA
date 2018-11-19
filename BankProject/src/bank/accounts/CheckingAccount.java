package bank.accounts;

import bank.exceptions.IllegalBalanceException;

public abstract class CheckingAccount extends BankAccount{
	
	public CheckingAccount(String ownerId, String ownerName, String accountNumber,Float balance) {
		super(ownerId,  ownerName, accountNumber, balance);
	}
	
	/**
	 * withdraw money using checks.
	 */
	protected void writeCheck(Float amount) throws IllegalBalanceException{
		try {
			this.withdraw(amount);
		}catch (IllegalBalanceException e) {	// catch and change the exception message
			throw new IllegalBalanceException("Can't Write a check - Insufficient funds");
		}				
	}
}

