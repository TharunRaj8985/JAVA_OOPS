// static variable means it allocates only one memory for entire class

// we can create many accounts(objects) but location of static variable will be same 
// best way to access static variable is using class name, since it is a class variable
// ex:- for static variable :- IFSC code for account users in same branch, same for all users
// helps to find number of accounts created // number of students enrolled

// final variable means we can declare once and value will be same for all the class and objects

//static means single memory class variable, final means only one value for it in all cases

// final class means we cannot use inheritance for that class
// final function means we cannot over ride
package final_static_variable;

public class BankDetails {

	String name;
	String nickname;
	private int accountnumber;
	static int noofaccounts;
	String ifsc;
	final static String BANK_Name = "SBI";
	Double balance;
	
	public BankDetails(String name,String ifsc)
	{
		this.balance=0.0;
		this.name=name;
		this.ifsc = ifsc;
		noofaccounts++;
		accountnumber = noofaccounts;
		
	}
	public BankDetails(String name,String ifsc, int Submitamount)
	{
		this.balance=0.0;
		this.name=name;
		this.ifsc = ifsc;
		noofaccounts++;
		accountnumber = noofaccounts;
		
	}
	public BankDetails(String name,String ifsc, String nickname)
	{
		this.balance=0.0;
		this.name=name;
		this.nickname = nickname;
		this.ifsc = ifsc;
		noofaccounts++;
		accountnumber = noofaccounts;
		
		
	}
	public int getAccountNumber()
	{
		return this.accountnumber;
	}
	public double totalBalance()
	{
		return this.balance;
	}
	public double Addmoney(double Submitamount)
	{
		this.balance =  this.balance+ Submitamount;
		return this.balance;
	}
	

}
