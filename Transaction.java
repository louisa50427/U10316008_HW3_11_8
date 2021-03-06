public class Transaction{

	// Declare five data fields
	private java.util.Date dateCreated;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	//A no-arg constructor
	
	Transaction(){
		dateCreated = new java.util.Date();
	}
	//constructor
	Transaction(char newType,double newAmount,double newBalance,String newDescription){
		type = newType;
		amount = newAmount;
		balance = newBalance;
		description = newDescription;
		dateCreated = new java.util.Date();
	}
	
	//setting and geting
	void setType(char newType){
		type = newType;
	}
	char getType(){
		return type;
	}
	void setAmount(double newAmount){
		amount = newAmount;
	}
	double getAmount(){
		return amount;
	}
	void setBalance(double newBalance){
		balance = newBalance;
	}
	double getBalance(){
		return balance;
	}
	void setDescription(String newDescription){
		description = newDescription;
	}
	String getDescription(){
		return description;
	}
	java.util.Date getDateCreated(){
		return dateCreated;
	}
	public String toString(){
		return "\nYour type is  " + getType() + "\nYour amount is " + getAmount() + "\nYour balance is " + getBalance() + "\nThe description is " + getDescription() + "\nThe date you create this account is  " + dateCreated;
	}
}
