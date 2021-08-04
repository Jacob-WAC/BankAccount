package bankaccount;

public class BankAccount {
private double checkingBalance;
private double savingsBalance;
private static int accounts ;
private static double totalAmountOfMoney;

public BankAccount() {
	accounts++;
}


public double getCheckingBalance() {
	return checkingBalance;
}


private void setCheckingBalance(double checkingBalance) {
	this.checkingBalance = checkingBalance;
}

public double getSavingsBalance() {
	return savingsBalance;
}

private void setSavingsBalance(double savingsBalance) {
	this.savingsBalance = savingsBalance;
}

public static double getTotalAmountOfMoney() {
	return totalAmountOfMoney;
}


public static int getAccounts() {
	return accounts;
}
public void depositChecking(double amount) {
	this.setCheckingBalance(this.getCheckingBalance() + amount);
	totalAmountOfMoney += amount;
}
public void depositSavings(double amount) {
	this.setSavingsBalance(this.getSavingsBalance() + amount);
	totalAmountOfMoney += amount;
}
public void withdrawlChecking(double amount) {
	this.setCheckingBalance(this.getCheckingBalance() - amount);
	totalAmountOfMoney -= amount;
}
public void withdrawlSavings(double amount) {
	this.setSavingsBalance(this.getSavingsBalance() - amount);
	totalAmountOfMoney -= amount;
}
public double totalMoney() {
	double total = this.getCheckingBalance() + this.getSavingsBalance();
	return total;
}



}
