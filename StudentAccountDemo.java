package assg2_senowitzo19;

/**
 * @author - Owen Senowitz
 * A class for showing StudentAccounts class and RewardsAccount class
 */

public class StudentAccountDemo {
	public static void main(String[] args) {
		// construction called
		StudentAccount s1 = new StudentAccount();
		// constructor called with initial balance
		StudentAccount s2 = new StudentAccount(100);
		// rewards account made with zero balance
		RewardsAccount s3 = new RewardsAccount();
		// rewards account made with initial balance
		RewardsAccount s4 = new RewardsAccount(100);
		// sets first student account to 500
		s1.setBalance(500);
		// charges first student account with 10
		s1.charge(10);
		// deposits 200 in first students account
		s1.deposit(200);
		// transfers 100 from s2 to s1
		s1.transferIn(s2, 100);
		// transfers 200 from s1 to s2
		s2.transferOut(s3, 200);
		// prints account number of s1
		System.out.println("s1 Account Number: " + s1.getAcctNo());
		// prints current balance of s1
		System.out.println("s1 Current Balance: " + s1.getBalance());
		// prints the counter
		System.out.println("Counter: " + StudentAccount.getCounter());
		// compare s1 to s2 for the case of s1 > s2
		System.out.println(s1.compareTo(s2));
		// make both bank accounts equal
		s1.setBalance(500);
		s2.setBalance(500);
		// compare s1 to s2 for the case of s1 = s2
		System.out.println(s1.compareTo(s2));
		// make s2 account have a higher balance
		s2.setBalance(600);
		// compare s1 to s2 for the case of s1 < s2
		System.out.println(s1.compareTo(s2));
		// calls the override string method
		s1.toString();
		// prints info for s1
		s1.printInfo();
		// prints info for s2
		s2.printInfo();
		// prints info for s3
		s3.printInfo();
		// prints info for s4
		s4.printInfo();
		// showing s3 rewards
		System.out.println("s3 Rewards Amount: " + s3.getRewards());
		// try to redeem rewards
		s3.redeemRewards();
		// make 5 deposits for 25 rewards
		for (int i = 0; i < 5; i++) {
		s3.deposit(100);
		}
		// show we have 25 deposits
		System.out.println("s3 Rewards Amount: " + s3.getRewards());
		// redeem our 25 rewards
		s3.redeemRewards();
		// show that it was redeemed
		System.out.println("s3 Rewards Amount: " + s3.getRewards());
		// print the override string method
		s3.toString();
		// deposit 0 rewards
		s3.deposit(0);
		// deposit 0 student
		s1.deposit(0);
		// charge 0
		s1.charge(0);
	}
}
