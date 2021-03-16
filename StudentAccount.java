package assg2_senowitzo19;

/**
 * @author - Owen Senowitz
 * A class for Student bank accounts
 */

public class StudentAccount {
	/**
	 * initializes our balance, account number, and counter variables
	 */
	private int acctNo;
	double balance;
	private static int counter;
	/**
	 * this is the default constructor
	 */
	public StudentAccount() {
		super();
		this.balance = 0;
		++counter;
		acctNo = counter;
	}
	/**
	 * this constructor receives the balance and sets the account number to the counter
	 * @param balance the starting balance of the account
	 */
	public StudentAccount(double balance) {
		super();
		this.balance= balance;
		++counter;
		acctNo = counter;
	}
	/**
	 * this just returns our account number
	 * @return acctNo which is our account number
	 */
	public int getAcctNo() {
		return acctNo;
	}
	/**
	 * this just returns our balance for the account
	 * @return balance how much money is in the account
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * this just returns the counter
	 * @return counter how many bank account there are
	 */
	public static int getCounter() {
		return counter;
	}
	/**
	 * sets the balance of the account to the parameter
	 * @param balance how much money the account is being set to
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * if the deposit amount is > 0 then we are going to add that amount to the balance of the account
	 * @param deposit how much money that we are putting in the account
	 */
	public void deposit(double deposit) {
		if (deposit > 0) {
			this.balance += deposit;
		}
		else {
			System.out.println("Updating balance was unsuccessful");
		}
	}
	/**
	 * if the charge amount is > 0 then we are going to subtract that from the balance of the account
	 * @param charge how much we are going to take from the account
	 */
	public void charge(double charge) {
		if (charge > 0) {
			this.balance -= charge;
		}
		else {
			System.out.println("Updating balance was unsuccessful");
		}
	}
	/**
	 * we are taking money from the parameter account and putting that amount of money into the object account
	 * @param x the account we are taking money from and putting in the object account
	 * @param transferIn the amount we are transferring
	 */
	public void transferIn(StudentAccount x, double transferIn) {
		if (transferIn > 0) {
			this.balance += transferIn;
			x.balance -= transferIn;
		}
	}
	/**
	 * we are taking money from the object account and putting that amount of money into the parameter account
	 * @param x the account we are sending money to and putting in that account
	 * @param transferOut the amount we are transferring
	 */
	public void transferOut(StudentAccount x, double transferOut) {
		if (transferOut > 0) {
			this.balance -= transferOut;
			x.balance += transferOut;
		}
	}
	/**
	 * prints all the information about the object account
	 */
	public void printInfo() {
		System.out.println("Account Number: " + this.acctNo);
		System.out.println("Current Balance: " + this.balance);
	}
	/**
	 * prints the account number and current balance
	 */
	@Override
	public String toString() {
		return "Account number: " + this.acctNo + "\nCurrent Balance: " + this.balance;
	}
	/**
	 * 1 means object account is greater than parameter account
	 * 0 means object account is equal to parameter account
	 * -1 means object account is less than parameter account
	 * @param x the account we are comparing
	 * @return 1, 0, -1
	 */
	public int compareTo(StudentAccount x) {
		if (this.balance > x.balance) {
			return 1;
		}
		if (this.balance == x.balance) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
