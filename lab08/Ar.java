package lab08; 

public class Ar {
    /**
     * Sort `array' using bubble sort
     */
    public static void sort(int[] array) {
        int[] tmpArr = new int[array.length];
		int ind = 0;
        for (int i = 0; i<array.length; i++){
			ind =0;
	        for (int j=0; j<array.length; j++){
	        	if (array[i]>array[j]){
	        		ind ++;
	        	}
	        }
	        tmpArr[ind]=array[i];
        }
        for (int i=0; i<array.length;i++){
            array[i]=tmpArr[i];
        }
    }

    /**
     * Reverse `array'
     */
    public static void reverse(int[] array) {
        int[] arr = new int[array.length];
        for (int i =0; i<array.length; i++){
        	arr[array.length-1-i]=array[i];
        }
        for (int i = 0; i<array.length; i++){
            array[i]=arr[i];
        }
    }
}
