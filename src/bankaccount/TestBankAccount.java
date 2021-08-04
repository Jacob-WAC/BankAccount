package bankaccount;

public class TestBankAccount {
public static void main(String[] args) {
	BankAccount jacobsAccount = new BankAccount();
	BankAccount willsAccount = new BankAccount();
	
	jacobsAccount.depositChecking(100);
	jacobsAccount.depositSavings(100);
	System.out.println(jacobsAccount.getCheckingBalance());
	System.out.println(BankAccount.getTotalAmountOfMoney());
	jacobsAccount.withdrawlChecking(50);
	System.out.println(jacobsAccount.totalMoney());
	
	willsAccount.depositChecking(100);
	willsAccount.depositSavings(100);
	System.out.println(willsAccount.getCheckingBalance());
	System.out.println(BankAccount.getTotalAmountOfMoney());
	willsAccount.withdrawlChecking(50);
	System.out.println(willsAccount.totalMoney());
	
	System.out.println(BankAccount.getAccounts());
	
}
}