import java.io.*;
import java.util.*;
import java.text.*;

/*
 * Create a console application for the banking management system.
 * Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and functions in each class.
 * In every Bank there should be at least 2 types of account saving and current.
 * Saving should give simple interest and Current should provide compound interest on deposited amount.
 * In the current account the interest is compounded twice a year (on half yearly its compounded).
 * For Every type of account at least 2 users will be there.
 * On the running of the application it should ask which bank we want to access.
 * Then what type of account you have.
 * And then for which user account we want to access.
 * Minimum amount for saving account is 2000/- and for current account is 5000/-
 * And we can calculate the interest for any given time and total amount as well.
 * Interest rates for saving will be 5% annually and for current it will be 8% annually.
 * Before calculating interest it should ask the user for how many years you want to calculate it.
 * Write code to calculate both types of interests as well for any of the users.
 */

public class BankProject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		System.out.println("Welcome to the Our Bank");
		System.out.println("Do you want to open an account? Yes/No");
		String open = sc.nextLine();
		Customer user1 = new Customer();
		while (true) {
			if (open.equals("Yes") == true) {
				System.out.println("Which Bank you want to open an account?\n 1. SBI  2. ICICI  3. PNB");
				int choice = sc.nextInt();
				if (choice == 1) {
					SBI sbi = new SBI();
					System.out.println("You Choose SBI Bank");
					System.out.println("Enter your Name : ");
					sc.nextLine();
					user1.setName(sc.nextLine());
					System.out.println("Enter your Age : ");
					sc.nextInt();
					user1.setDob(sc.nextLine());
					System.out.println("Which type of Account you want to create? \n 1. Saving  2. Current");
					int accType = sc.nextInt();
					if (accType == 1) {
						user1.setBalance(2000);
						System.out.println("Account has been opened and account no is : 123");
						System.out.println(
								"Do you want to : 1. Deposite Money  2. Withdraw Money  3. Loan  4. Check Balance");
						int money = sc.nextInt();
						if (money == 1) {
							System.out.println("Enter your amount to Deposite");
							user1.setDeposite(sc.nextInt());
							System.out.println("Your Balance is : " + user1.getBalance());
						} else if (money == 2) {
							System.out.println("Enter your amount to withdraw");
							user1.setWithdraw(sc.nextInt());
							if (user1.getWithdraw() <= user1.getBalance()) {
								System.out.println("Your Balance is : " + user1.getBalance());
							} else {
								System.out.println("Inuficient Balance in your account");
							}
						} else if (money == 3) {
							System.out.println("Enter your Principal Balance, Time(in years)");
							double loan = sbi.saving(sc.nextInt(), sc.nextInt());
							System.out.println("Total Annual interest is : " + decimal.format(loan));
						} else if (money == 4) {
							System.out.println("Your Balance is : " + user1.getBalance());
						} else {
							System.out.println("Invalid input please try again...");
						}
					} else if (accType == 2) {
						user1.setBalance(5000);
						System.out.println("Account has been opened and account no is : 321");
						System.out.println(
								"Do you want to : 1. Deposite Money  2. Withdraw Money  3. Loan  4. Check Balance");
						int money = sc.nextInt();
						if (money == 1) {
							System.out.println("Enter your amount to Deposite");
							user1.setDeposite(sc.nextInt());
							System.out.println("Your Balance is : " + user1.getBalance());
						} else if (money == 2) {
							System.out.println("Enter your amount to withdraw");
							user1.setWithdraw(sc.nextInt());
							if (user1.getWithdraw() <= user1.getBalance()) {
								System.out.println("Your Balance is : " + user1.getBalance());
							} else {
								System.out.println("Inuficient Balance in your account");
							}
						} else if (money == 3) {
							System.out.println("Enter your Principal Balance, Time(in years)");
							double loan = sbi.current(sc.nextInt(), sc.nextInt());
							System.out.println("Total Annual interest is : " + decimal.format(loan));
						} else if (money == 4) {
							System.out.println("Your Balance is : " + user1.getBalance());
						} else {
							System.out.println("Invalid input please try again...");
						}
					} else {
						System.out.println("Invalid Input please try again..");
					}
				} else if (choice == 2) {
					ICICI icici = new ICICI();
					System.out.println("You Choose ICICI Bank");
					System.out.println("Enter your Name : ");
					sc.nextLine();
					user1.setName(sc.nextLine());
					System.out.println("Enter your Age : ");
					sc.nextInt();
					user1.setDob(sc.nextLine());
					System.out.println("Which type of Account you want to create? \n 1. Saving  2. Current");
					int accType = sc.nextInt();
					if (accType == 1) {
						user1.setBalance(2000);
						System.out.println("Account has been opened and account no is : 123");
						System.out.println(
								"Do you want to : 1. Deposite Money  2. Withdraw Money  3. Loan  4. Check Balance");
						int money = sc.nextInt();
						if (money == 1) {
							System.out.println("Enter your amount to Deposite");
							user1.setDeposite(sc.nextInt());
							System.out.println("Your Balance is : " + user1.getBalance());
						} else if (money == 2) {
							System.out.println("Enter your amount to withdraw");
							user1.setWithdraw(sc.nextInt());
							if (user1.getWithdraw() <= user1.getBalance()) {
								System.out.println("Your Balance is : " + user1.getBalance());
							} else {
								System.out.println("Inuficient Balance in your account");
							}
						} else if (money == 3) {
							System.out.println("Enter your Principal Balance, Time(in years)");
							double loan = icici.saving(sc.nextInt(), sc.nextInt());
							System.out.println("Total Annual interest is : " + decimal.format(loan));
						} else if (money == 4) {
							System.out.println("Your Balance is : " + user1.getBalance());
						} else {
							System.out.println("Invalid input please try again...");
						}
					} else if (accType == 2) {
						user1.setBalance(5000);
						System.out.println("Account has been opened and account no is : 321");
						System.out.println(
								"Do you want to : 1. Deposite Money  2. Withdraw Money  3. Loan  4. Check Balance");
						int money = sc.nextInt();
						if (money == 1) {
							System.out.println("Enter your amount to Deposite");
							user1.setDeposite(sc.nextInt());
							System.out.println("Your Balance is : " + user1.getBalance());
						} else if (money == 2) {
							System.out.println("Enter your amount to withdraw");
							user1.setWithdraw(sc.nextInt());
							if (user1.getWithdraw() <= user1.getBalance()) {
								System.out.println("Your Balance is : " + user1.getBalance());
							} else {
								System.out.println("Inuficient Balance in your account");
							}
						} else if (money == 3) {
							System.out.println("Enter your Principal Balance, Time(in years)");
							double loan = icici.current(sc.nextInt(), sc.nextInt());
							System.out.println("Total Annual interest is : " + decimal.format(loan));
						} else if (money == 4) {
							System.out.println("Your Balance is : " + user1.getBalance());
						} else {
							System.out.println("Invalid input please try again...");
						}
					} else {
						System.out.println("Invalid Input please try again..");
					}
				} else if (choice == 3) {
					PNB pnb = new PNB();
					System.out.println("You Choose PNB Bank");
					System.out.println("Enter your Name : ");
					sc.nextLine();
					user1.setName(sc.nextLine());
					System.out.println("Enter your Age : ");
					sc.nextInt();
					user1.setDob(sc.nextLine());
					System.out.println("Which type of Account you want to create? \n 1. Saving  2. Current");
					int accType = sc.nextInt();
					if (accType == 1) {
						user1.setBalance(2000);
						System.out.println("Account has been opened and account no is : 123");
						System.out.println(
								"Do you want to : 1. Deposite Money  2. Withdraw Money  3. Loan  4. Check Balance");
						int money = sc.nextInt();
						if (money == 1) {
							System.out.println("Enter your amount to Deposite");
							user1.setDeposite(sc.nextInt());
							System.out.println("Your Balance is : " + user1.getBalance());
						} else if (money == 2) {
							System.out.println("Enter your amount to withdraw");
							user1.setWithdraw(sc.nextInt());
							if (user1.getWithdraw() <= user1.getBalance()) {
								System.out.println("Your Balance is : " + user1.getBalance());
							} else {
								System.out.println("Inuficient Balance in your account");
							}
						} else if (money == 3) {
							System.out.println("Enter your Principal Balance, Time(in years)");
							double loan = pnb.saving(sc.nextInt(), sc.nextInt());
							System.out.println("Total Annual interest is : " + decimal.format(loan));
						} else if (money == 4) {
							System.out.println("Your Balance is : " + user1.getBalance());
						} else {
							System.out.println("Invalid input please try again...");
						}
					} else if (accType == 2) {
						user1.setBalance(5000);
						System.out.println("Account has been opened and account no is : 321");
						System.out.println(
								"Do you want to : 1. Deposite Money  2. Withdraw Money  3. Loan  4. Check Balance");
						int money = sc.nextInt();
						if (money == 1) {
							System.out.println("Enter your amount to Deposite");
							user1.setDeposite(sc.nextInt());
							System.out.println("Your Balance is : " + user1.getBalance());
						} else if (money == 2) {
							System.out.println("Enter your amount to withdraw");
							user1.setWithdraw(sc.nextInt());
							if (user1.getWithdraw() <= user1.getBalance()) {
								System.out.println("Your Balance is : " + user1.getBalance());
							} else {
								System.out.println("Inuficient Balance in your account");
							}
						} else if (money == 3) {
							System.out.println("Enter your Principal Balance, Time(in years)");
							double loan = pnb.current(sc.nextInt(), sc.nextInt());
							System.out.println("Total Annual interest is : " + decimal.format(loan));
						} else if (money == 4) {
							System.out.println("Your Balance is : " + user1.getBalance());
						} else {
							System.out.println("Invalid input please try again...");
						}
					} else {
						System.out.println("Invalid Input please try again..");
					}
				}
				System.out.println("Do you Want to print mini statement? Yes/No");
				sc.nextLine();
				String statement = sc.nextLine();
				if (statement.equals("Yes") == true) {
					File f = new File(
							"C:\\Users\\win\\eclipse-workspace\\BankingManagementSystem\\src\\miniStatement.txt");
					try {
						if (f.createNewFile()) {
							System.out.println("File Successfully Created...");
						} else {							
							System.out.println("File already Exists..");
						}
					} catch (IOException e) {
						System.out.println("Exception Handled");
					}
				} else {
					System.out.println("Thanks for visiting...");
					return;
				}
			} else {
				System.out.println("Thanks for visiting...");
				break;
			}
		}
	}
}