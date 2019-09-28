package com.execution;

import com.bv.Account;
import com.bv.Transactions;

public class BankApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account("Jaya");
        //System.out.println(ac1);
		Transactions t1 = new Transactions(ac1);
		/*
		 * t1.deposite(200); t1.withdraw(100); t1.deposite(500);
		 */
		t1.chooseOperation();
		
		Account ac2 = new Account("mJaya");
        //System.out.println(ac1);
		Transactions t2 = new Transactions(ac2);
		t2.chooseOperation();
/*		System.out.println("----------");

		
		 * Account ac2=new Account("Maya"); System.out.println(ac2); Transactions t2=new
		 * Transactions(ac2); t2.deposite(1000); System.out.println("----------");
		 * 
		 * Account ac3=new Account("Faya"); System.out.println(ac3); Transactions t3=new
		 * Transactions(ac3); t3.deposite(700); System.out.println("----------");
		 */
	}

}
