package bank.accounts;

import bank.exceptions.IllegalBalanceException;


public abstract class BankAccount 	{

	// instance variables
	private	final	String	m_accountNumber; // account number (can't changed)
	private			String	m_ownerName; // holder's name
	private			String	m_ownerId; // holder's ID	
	private 		Integer	m_balance;
	
	// constructor
	public BankAccount(String ownerId, String ownerName, String accountNumber) {
		m_ownerName = ownerName;
		m_ownerId = ownerId;
		m_accountNumber = accountNumber;
	}

	//************	Account	management	************\\
	
	abstract void management();
	
	public void deposit(int amount) {
		if (amount>0) // cant add negative amount
		m_balance += amount;		
	}
	
	public void withdraw(int amount) throws IllegalBalanceException{
		if (m_balance>=amount)
			m_balance -= amount;
		else
			throw new IllegalBalanceException("Can't withdraw money from acount");
	}	
	
	//************	Getters		************\\
	
	public Integer getBalance() {
		return m_balance;
	}
	
	public String getAccountNumber() {
		return m_accountNumber;
	}

	public String getOwnerName() {
		return m_ownerName;
	}
	
	public String getOwnerId() {
		return m_ownerId;
	}
	
	//************	Setters		************\\
	
	public void setOwnerName(String m_ownerName) {
		this.m_ownerName = m_ownerName;
	}
	
	public void setOwnerId(String m_ownerId) {
		this.m_ownerId = m_ownerId;
	}

	@Override
	public String toString(){
		String output = "";
		output = output + "Account number: " + m_accountNumber + "\n" +
				"Owner's name: " + m_ownerName + "\n" +
				"Owner's ID: " + m_ownerId +"\n" +
				"Balance: " + m_balance + "\n" +
				"==========================================";
		return output;
	}
	
	//***Auto Generated By Eclipse************\\
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (m_accountNumber == null) {
			if (other.m_accountNumber != null)
				return false;
		} else if (!m_accountNumber.equals(other.m_accountNumber))
			return false;
		if (m_balance == null) {
			if (other.m_balance != null)
				return false;
		} else if (!m_balance.equals(other.m_balance))
			return false;
		if (m_ownerId == null) {
			if (other.m_ownerId != null)
				return false;
		} else if (!m_ownerId.equals(other.m_ownerId))
			return false;
		if (m_ownerName == null) {
			if (other.m_ownerName != null)
				return false;
		} else if (!m_ownerName.equals(other.m_ownerName))
			return false;
		return true;
	}
}


