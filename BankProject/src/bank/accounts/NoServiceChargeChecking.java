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

public class NoServiceChargeChecking extends CheckingAccount{	

	private Float m_minBalance = (float) 10.0; // the fee to charge every month
	
	//************ Constructors ************\\
	//New fee
	public	NoServiceChargeChecking(String ownerId, String ownerName, String accountNumber, Float balance, Float minBalance) {
		super(ownerId,  ownerName, accountNumber, balance);
		m_minBalance = minBalance;		
	}
	
	//Default minimal Balance
	public	NoServiceChargeChecking(String ownerId, String ownerName, String accountNumber, Float balance) {
		super(ownerId,  ownerName, accountNumber, balance);
	}

	@Override
	void management() {	
	}	
	
	//************	Setter & Getter ************\\
	
	public Float getMinBalance() {
		return m_minBalance;
	}
	
	public void setMinBalance(Float minBalance) {
		this.m_minBalance = minBalance;
	}	
}

