package lab01;

/**
This program tests the monthlyPayment method of HomeLoan
@author Keni Mou
*/

public class HomeLoanTester{
	public static void main (String[] args) {
		HomeLoan test = new HomeLoan(200000, 5, 1500);
		System.out.println(test.payoffMonths());
	}
}
