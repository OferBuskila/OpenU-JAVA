//package mmn12b;
//
//public class NoServiceChargeChecking extends CheckingAccount{
//
//	protected final double minBalance = 100;
//	
//	public NoServiceChargeChecking(int _accNum, String _ownName, String _id,
//			double _balance) {
//		super(_accNum, _ownName, _id, _balance);
//	}
//
//	public NoServiceChargeChecking() {
//	}
//
//	@Override
//	void accAdmin() {
//		
//	}
//	
//	@Override
//	protected boolean writeCheck(double amount) {
//		if (!(balance < minBalance)){
//			balance -= amount;
//			return true;
//		}
//		else
//			return false;
//	}
//}
//



package bank.accounts;

import bank.exceptions.IllegalBalanceException;

public class NoServiceChargeChecking extends CheckingAccount{	

	private Integer m_minBalance = 10; // the fee to charge every month
	
	//************ Constructors ************\\
	//New fee
	public	NoServiceChargeChecking(String ownerId , String ownerName, String accountNumber, Integer minBalance) {
		super(ownerId,  ownerName, accountNumber);
		m_minBalance = minBalance;		
	}
	
	//Default minimal Balance
	public	NoServiceChargeChecking(String ownerId , String ownerName, String accountNumber) {
		super(ownerId,  ownerName, accountNumber);
	}

	@Override
	void management() {	
	}	
	
	//************	Setter & Getter ************\\
	
	public Integer getMinBalance() {
		return m_minBalance;
	}
	
	public void setMinBalance(Integer minBalance) {
		this.m_minBalance = minBalance;
	}	
}

