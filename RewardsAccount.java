package assg2_senowitzo19;

/**
 * @author - Owen Senowitz
 * A class for rewarding students for having more than $100 deposits
 */

public class RewardsAccount extends StudentAccount {
	/**
	 * initializes the rewards variable
	 */
	private double rewards;
	/**
	 * sets the starting rewards to 0
	 */
	public RewardsAccount() {
		super();
		rewards = 0;
	}
	/**
	 * if the starting balance is above or equal to 100 they get 5 reward
	 * @param balance the account balance
	 */
	public RewardsAccount(double balance) {
		super(balance);
		if (balance >= 100)
			rewards = 5;
	}
	/**
	 * returns the rewards
	 * @return rewards
	 */
	public double getRewards() {
		return rewards;
	}
	/**
	 * if rewards are greater than or equal 25 we are going to add 25 to the balance of the account
	 * if rewards are less than 25 we are going to print that there are not enough rewards
	 * @return rewards the amount of rewards
	 */
	public double redeemRewards() {
		if (this.rewards >= 25) {
			double balance = getBalance();
			setBalance(balance + rewards);
			rewards = 0;
		}
		else {
			System.out.println("Insufficient amount for redeeming rewards");
		}
		return rewards;
	}
	/**
	 * prints the account number current balance and the amount of rewards
	 */
	@Override
	public String toString() {
		return "Account number: " + getAcctNo() + "\nCurrent Balance: " + getBalance() + "\nRewards Balance: " + this.rewards;
	}
	/**
	 * if the deposit is greater than 0 we are going to deposit that amount in the account
	 * if the deposit is over 100 then we are going to add 5 rewards
	 */
	@Override
	public void deposit(double deposit) {
		if (deposit > 0) {
			double balance = getBalance();
			setBalance(balance + deposit);
			if (deposit >= 100) {
				rewards += 5;
			}
		}
		else {
			System.out.println("Account balance updated successfully");
		}
	}
	/**
	 * prints the account number current balance and the amount of rewards
	 */
	@Override
	public void printInfo() {
		System.out.println("Account Number: " + getAcctNo());
		System.out.println("Current Balance " + getBalance());
		System.out.println("Rewards Balance " + rewards);
	}
}
