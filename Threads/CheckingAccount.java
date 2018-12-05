package demos.Threads;
public class CheckingAccount {
	private double balance;
	private String accountName;

	public CheckingAccount(double balance, String accountName) {
		this.balance = balance;
		this.accountName = accountName;
	}

	public synchronized double getBalance() {
		return this.balance;
	}

	public synchronized void setBalance(double balance) {
		System.out.println(Thread.currentThread().getName() + " - start of setBalance() -->");

		this.balance = this.balance + balance;

		System.out.println(Thread.currentThread().getName() + " - middle of setBalance() --> " + this.accountName + "; "
				+ this.balance);

		System.out.println(Thread.currentThread().getName() + " - end of setBalance() -->");
	}

	public String toString() {
		return (" { account name: " + this.accountName + "; amount: " + this.balance + " }");
	}

}
