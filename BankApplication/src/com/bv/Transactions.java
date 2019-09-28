package com.bv;

import java.util.Scanner;

public class Transactions {
	Account ac;

	public Transactions(Account ac) {
		super();
		this.ac = ac;
	}

	public void deposite(double amount) {
		System.out.println("Before deposite:" + ac.getBalance());
		ac.setBalance(ac.getBalance() + amount);
		System.out.println(amount + " Rs. Amount credited");
		System.out.println("Toital balance after deposite" + ac.getBalance());
	}

	public void withdraw(double amount) {
		System.out.println("Amount before withdraw:" + ac.getBalance());
		if (amount < 0) {
			System.out.println("Amount cannot be negative");
		} else if (ac.getBalance() < amount) {
			System.out.println("Insufficient fund");
		} else if ((ac.getBalance() - amount) < Account.MIN_BALANCE) {
			System.out.println("Min balance to be maintained");
		} else {
			ac.setBalance(ac.getBalance() - amount);
			System.out.println("Amount deducted is:" + amount);
			System.out.println("total balance is:" + ac.getBalance());
		}
	}

	public void chooseOperation() {
        
		Scanner sc = null;
		int ch;
		boolean flag =true;
	try {

			do {

				System.out.println("1.Deposite\n 2.Withdraw\n 3.Display Balance \n 4.Exit:");
				System.out.println("Enter your choice:");
				sc = new Scanner(System.in);
				ch = sc.nextInt();

				switch(ch) {
				case 1:
					System.out.println("Enter the amount to deposit:");
					deposite(sc.nextDouble());
					break;

				case 2:
					System.out.println("Enter the amount to withdraw");
					withdraw(sc.nextDouble());
					break;

				case 3:
					System.out.println(ac);
					break;

				case 4:
					System.out.println("Transaction completed:");
					flag=false;
				//	System.exit(0);
					

				default:
					System.out.println("Enter vaild choice:");

				}

			}
      while (flag);
		}

	finally
	{
		//	sc.close();
		}
	}

}
