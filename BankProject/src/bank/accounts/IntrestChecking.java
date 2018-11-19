package bank.accounts;

public class IntrestChecking extends NoServiceChargeChecking{

	private Float m_intrest = (float) 0.2; 
	
	//************ Constructors ************\\
	
	public IntrestChecking(String ownerId , String ownerName, String accountNumber, Float balance, Float intrest) {
		super(ownerId,  ownerName, accountNumber, balance);
		m_intrest	=	intrest;
		this.setMinBalance(this.getMinBalance()+100); // set higher balance
	}
	
	public IntrestChecking(String ownerId , String ownerName, String accountNumber, Float balance) {
		super(ownerId,  ownerName, accountNumber, balance);
		this.setMinBalance(this.getMinBalance()+100); // set higher balance
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
