package bank.accounts;

public class SavingsAccount extends BankAccount{
	
	private Float m_intrest = (float) 0.1; 
	
	//************ Constructors ************\\
	
	public SavingsAccount(String ownerId, String ownerName, String accountNumber, Float balance, Float intrest) {
		super(ownerId,  ownerName, accountNumber,balance);
		m_intrest	=	intrest;
	}
	
	public SavingsAccount(String ownerId, String ownerName, String accountNumber,Float balance) {
		super(ownerId,  ownerName, accountNumber,balance);
	}

	//************	Account	management	************\\
	
	@Override
	public void management() {
		//set the new balance after the intrest.
		this.deposit(calIntrest());
	}	

	private Float calIntrest(){	
		return (this.getBalance() * m_intrest)/100;
	}
	
	//************	Setter & Getter ************\\
	
	public Float getIntrest() {
		return m_intrest;
	}

	public void setIntrest(Float intrest) {
		this.m_intrest = intrest;
	}
	
}
