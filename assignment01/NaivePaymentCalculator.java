package assignment01;

/**
A class to calculate monthly payment for home loan.
@author Keni Mou 
*/

public class NaivePaymentCalculator {
	
	/**
	Constructs a HomeLoan object...
	@param total: total amount to pay off
	@param apr: annual percentage rate
	@param numMonths: number of months to payoff the loan.
	@catch IllegalArgumentException 3: if the monthly payment is lower
		than the monthly interest on the price of of the home
	*/
	
	public static double payment(int total, double apr, int numMonths){
		double payment = 1;
		boolean notDone = true;
		while(notDone){
			try {
				 // create a HomeLoan variable temp equal to a new HomeLoan	
				 // with the arguments total, apr, payment.
				 // This could throw the IllegalArgumentException and we jump
				 // to the catch block
				HomeLoan temp = new HomeLoan(total, apr, payment);

				 // declare an int months set equal to temp.payoffMonths()
				int months = temp.payoffMonths();
				
				 // if (months <= numMonths) set notDone to false
				 // else add 0.01 to payment
				if (months <= numMonths){
					notDone = false;
				}else{
					payment = payment + 0.01;
				}
				 } catch(IllegalArgumentException e) {
				 // add 0.01 to payment
					 payment = payment + 0.01;
				 }
		}
		return payment;
	}
	
	/**
	calculate the maximum loan possible to be repaid with a specific 
	monthly payment, apr, and number of months
	*/
	
	public static double possibleTotal (double apr, int numMonths, double payment){
		int maxLoan = (int)payment;
		HomeLoan ini = new HomeLoan(maxLoan, apr, payment);
		int month = ini.payoffMonths();
		while (month<=numMonths){
			try{
				maxLoan = maxLoan + 1;
				HomeLoan temp = new HomeLoan(maxLoan, apr, payment);
				month = temp.payoffMonths();
			} catch(IllegalArgumentException e) {
				maxLoan = maxLoan + 1;
			 }
			
		}
			
		return maxLoan;
	}

}
