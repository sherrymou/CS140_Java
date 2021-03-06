package exam01;

public class Q2 {

	/**
	This method is to check whether all the integers in a 
	array are greater than n.
	@param int[] array: a array contain integers
	@param int n: an integer to be compared with
	@return true if all elements in `array'
        	are greater than `n' or the array is empty. 
			Otherwise return false.
	*/

    public boolean allGreater(int[] array, int n) {
        // Return true if all elements in `array'
        // are greater than `n'. Otherwise return false.
        // Assume `array' is not null
        // but if `array` is empty return true.

		boolean retVal = true;

		if (array.length>0){
			for (int i:array){
				if (i<=n){
					retVal = false;
				}
			}
		}
		return retVal;
    }
}
