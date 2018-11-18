package bank.accounts;

public class IntrestChecking extends NoServiceChargeChecking{

	private int m_intrest = 10; 
	
	//************ Constructors ************\\
	
	public IntrestChecking(String ownerId , String ownerName, String accountNumber,int intrest) {
		super(ownerId,  ownerName, accountNumber);
		m_intrest	=	intrest;
		this.setMinBalance(this.getMinBalance()+100); // set higher balance
	}
	
	public IntrestChecking(String ownerId , String ownerName, String accountNumber) {
		super(ownerId,  ownerName, accountNumber);
		this.setMinBalance(this.getMinBalance()+100); // set higher balance
	}

	//************	Account	management	************\\
	
	@Override
	public void management() {
		//set the new balance after the intrest.
		this.deposit(calIntrest());
	}	

	private int calIntrest(){	
		return (this.getBalance() * m_intrest)/100;
	}
	
	//************	Setter & Getter ************\\
	
	public double getIntrest() {
		return m_intrest;
	}

	public void setIntrest(int intrest) {
		this.m_intrest = intrest;
	}
}
