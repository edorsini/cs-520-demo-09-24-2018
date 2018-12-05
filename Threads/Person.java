package demos.Threads;

import demos.Threads.CheckingAccount;

public class Person extends Thread {
	String name;
	CheckingAccount myAccount;

	public Person(String name, CheckingAccount checking) {
		this.name = name;
		this.myAccount = checking;
	}

	public void run() {
		this.myAccount.setBalance(1000);
		System.out.println("$" + this.myAccount.getBalance());

//		System.out.println(Thread.currentThread().getName() + " from Person() --> " + this.myAccount + "; "
//				+ this.myAccount.getBalance());

	}

}
