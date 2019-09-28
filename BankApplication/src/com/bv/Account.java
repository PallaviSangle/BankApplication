package com.bv;

public class Account {

	private static int acc_no;
	private String holder_name;

	public final static double MIN_BALANCE = 1000.0;
	private double balance;

	public double getBalance() {
		return balance;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	static {
		acc_no = 100;
	}

	public Account(String holder_name) {
		super();
		// this.acc_no = acc_no;
		acc_no++;
		this.holder_name = holder_name;
		balance = MIN_BALANCE;

	}

	@Override
	public String toString() {
		return "Account [Account No=" + acc_no + ",holder_name=" + holder_name + ", balance=" + balance + "]";
	}

	/*
	 * @Override public String toString() { return "Account [Account No=" + acc_no
	 * +", Holder_name=" + getHolder_name()+ ",Intial balance= "+MIN_BALANCE+"]"; }
	 */

}
