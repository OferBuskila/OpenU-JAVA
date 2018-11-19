package bank.accounts;

public class HighInterestSavings extends SavingsAccount {

	private double minBalance;
	public HighInterestSavings(int _accNum, String _ownName, String _id,
			double _balance) {
		super(_accNum, _ownName, _id, _balance);
	}
	
	public HighInterestSavings() {
		
	}

	public boolean underMinBalance(){
		return balance < minBalance;
	}

	/**
	 * Withdraw money from the account only if this account has money in it.
	 * 
	 * @param amount
	 * 	-The money to withdraw
	 * @return 
	 * 	true if the action was performed successfully
	 * 	false otherwise.
	 * 
	 */
	protected boolean withdraw(double amount){
		boolean result = true;
		if(!underMinBalance()){
			result = false;
		}
		else{
			balance -= amount;
		}
		return result;
	}
	
	/**
	 * @return the minBalance
	 */
	public double getMinBalance() {
		return minBalance;
	}
	/**
	 * @param minBalance the minBalance to set
	 */
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	

}
