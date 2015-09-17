package assignment01;

/**
A class to provide some information concerning home loans.
@author Keni Mou 
*/

public class HomeLoan {
	private int initialPrice;
	private double mim;
	private double monthlyPayment;

	/**
	Constructs a HomeLoan object...
	@param anInitialPrice: the price of the home
	@param apr: annual percentage rate
	@param aMonthlyPayment: monthly payment
	@throws IllegalArgumentException: if the monthly payment is lower
		than the monthly interest on the price of of the home
	*/

	public HomeLoan(int anInitialPrice, double apr, double aMonthlyPayment){
		initialPrice = anInitialPrice;
		monthlyPayment = aMonthlyPayment;
		mim = apr/12/100; // mim = apr/(12*100)
		
		if (initialPrice * mim > monthlyPayment) {
			throw new IllegalArgumentException("Payments are too small.");

		}
	}

	
	/**
	Computes the number of monthly payments needed to pay off the loan
	using the payments and interest rate specified in the constructor
	@return the number of months needed to pay off the home loan
	*/

	public int payoffMonths(){
		double remainingLoan = initialPrice;
		int count=0;
		while(remainingLoan>0){
			// count +=1;
			// remainingLoan += remainingLoan * mim;		
			// remainingLoan -= monthlyPayment;
			count = count +1;
			remainingLoan = remainingLoan + (remainingLoan*mim);
			remainingLoan = remainingLoan - monthlyPayment;
		}
		return count;
	}

	private double power (double x, int n){
		double retVal = 1;
		if (n < 0){
			retVal = 1 / power(x,-n);
		}else{
			for (int i = 1; i <= n; i++) {
				retVal = retVal * x;		
			}	
		}
		return retVal;
	}

	/**
	Computes the monthly payment
	@ return the number of payment
	*/

	public double monthlyPayment(int numYears){
		return initialPrice * power(1+mim, 12*numYears) *mim/(power(1+mim, 12*numYears)-1);
	}

}
