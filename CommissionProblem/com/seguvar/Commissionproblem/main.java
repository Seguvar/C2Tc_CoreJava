package com.seguvar.Commissionproblem;

public class main {

	public static void main(String[] args) {
		Student student = new Student();
		Commission commission = new Commission();
		commission.Accept_Details_of_an_Employee();
		double commissionAmount = commission.CalculateCommission();
		System.out.println("The commission Amount is :"+commissionAmount);
		
	}

}