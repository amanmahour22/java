public class Account {
	public static int balance;
	public static int withdraw;
	public static int deposite;

	public static int getWithdraw() {
		return withdraw;
	}
	
	public static void setWithdraw(int withdraw) {
		balance = balance - withdraw;
		Account.withdraw = withdraw;
	}
	public static int getDeposite() {
		return deposite;
	}
	public static void setDeposite(int deposite) {
		balance = balance + deposite;
		Account.deposite = deposite;
	}
	public static int getBalance() {
		return balance;
	}
	public static void setBalance(int balance) {
		Account.balance = balance;
	}
	
	
	
	
//	public Account(int withdraw) {
//		this.withdraw = withdraw;
//	}
//	public static void withdraw() {
//		if (withdraw <= balance) {
//			System.out.println("Withdraw Money");
//			balance = balance - withdraw;
//		}
//	}
}