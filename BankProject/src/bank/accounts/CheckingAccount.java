package bank.accounts;

import bank.exceptions.IllegalBalanceException;

public abstract class CheckingAccount extends BankAccount{
	
	public CheckingAccount(String ownerId , String ownerName, String accountNumber) {
		super(ownerId,  ownerName, accountNumber);
	}
	
	/**
	 * withdraw money using checks.
	 */
	protected void writeCheck(int amount) throws IllegalBalanceException{
		try {
			this.withdraw(amount);
		}catch (IllegalBalanceException e) {	// catch and change the exception message
			throw new IllegalBalanceException("Can't Write a check - Insufficient funds");
		}				
	}
}

