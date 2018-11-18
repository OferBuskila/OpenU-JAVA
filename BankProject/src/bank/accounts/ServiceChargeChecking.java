package bank.accounts;

import bank.exceptions.IllegalBalanceException;

public class ServiceChargeChecking extends CheckingAccount{	

	private Integer m_fee = 10; // the fee to charge every month
	
	//*** Constructors ************\\
	//New fee
	public	ServiceChargeChecking(String ownerId , String ownerName, String accountNumber, Integer fee) {
		super(ownerId,  ownerName, accountNumber);
		m_fee = fee;		
	}
	
	//Default fee
	public	ServiceChargeChecking(String ownerId , String ownerName, String accountNumber) {
		super(ownerId,  ownerName, accountNumber);
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
	public Integer getFee() {
		return m_fee;
	}
	
	public void setFee(Integer m_fee) {
		this.m_fee = m_fee;
	}	
}
