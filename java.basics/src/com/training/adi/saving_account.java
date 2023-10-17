package com.training.adi;

public class saving_account implements account {
	double amount;
	public saving_account(double amount) {
		this.amount = amount;
	}
	public double interest_rate(){
		this.amount = this.amount+((this.amount)*7.6)*100;
		return this.amount;
	}
	

}
