package bank.accounts;

import bank.exceptions.IllegalBalanceException;

public class ServiceChargeChecking extends CheckingAccount{	

	private Float m_fee = (float) 10; // the fee to charge every month
	
	//*** Constructors ************\\
	//New fee
	public	ServiceChargeChecking(String ownerId , String ownerName, String accountNumber, Float balance, Float fee) {
		super(ownerId,  ownerName, accountNumber, balance);
		m_fee = fee;		
	}
	
	//Default fee
	public	ServiceChargeChecking(String ownerId , String ownerName, String accountNumber, Float balance) {
		super(ownerId,  ownerName, accountNumber, balance);
	}

	//************	Account	management	************\\
	
	@Override
	//Charge the fee from the account's balance.
	void management() {
		try {
			this.withdraw(m_fee);
		}catch (IllegalBalanceException e) {	// catch and change the exception message
			//TODO : throw new IllegalBalanceException("Can't Preform management action - Insufficient funds");
		}		
	}	
	
	//************	Setter & Getter ************\\
	public Float getFee() {
		return m_fee;
	}
	
	public void setFee(Float m_fee) {
		this.m_fee = m_fee;
	}	
}
