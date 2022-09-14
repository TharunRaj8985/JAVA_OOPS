package final_static_variable;

public class BankDetailsUse {

	public static void main(String[] args)
	{
		BankDetails p1 = new BankDetails("Tharun","SBI001462");
		BankDetails p2 = new BankDetails("Prasanth","SBI001462");
		System.out.println(BankDetails.BANK_Name);
		System.out.println(BankDetails.noofaccounts);
		p1.Addmoney(10000.0);
		System.out.println(p1.totalBalance());
		p1.Addmoney(20000.0);
		System.out.println(p1.totalBalance());
	}
}
