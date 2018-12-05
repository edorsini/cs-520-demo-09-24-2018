package demos.Threads;

import demos.Threads.CheckingAccount;

public class Driver {

	public static void main(String[] args) {
		System.out.println("This is the start of the program...");

		CheckingAccount sharedAccount = new CheckingAccount(0, "checking");
		Person Ed = new Person("Ed", sharedAccount);
		Person Amanda = new Person("Amanda", sharedAccount);

		Ed.start();
		Amanda.start();

		System.out.println("driver.java Ed's account: " + Ed.myAccount);
		System.out.println("driver.java Amanda's: " + Amanda.myAccount);

	}

}
