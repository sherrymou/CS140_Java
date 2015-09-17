package lab02;

import java.util.Random;
import java.util.Arrays;

public class Lab02A {

/**
	public int a;
	private String nobody = "nobody";
	private String[] nobodies = {"hi","hi"};

	public Lab02A(){
		// constructor	

	}

	public int doSomething() {
		return 1;
	}
	
	public void hello(){
		//hello
		int i;
	}

*/
	public static void main (String[] args){
		boolean[] bools = new boolean[5];
        	int[] ints = new int[5];
        	double[] dbls = new double[5];
        	Object[] objs = new Object[5];
        	Boolean[] bools1 = new Boolean[5];
        	String[] strs = new String[5];

		System.out.println(bools[0]);
		System.out.println(ints[1]);
		System.out.println(dbls[2]);
		System.out.println(objs[4]);
		System.out.println(bools1[0]); // there is no 5th index
		System.out.println(strs[1]);

		Random rand = new Random();
		boolean [] bools2 = {
			rand.nextBoolean(),
			rand.nextBoolean(),
			rand.nextBoolean(),
			rand.nextBoolean()
		};
		int [] ints2 = {
			rand.nextInt(),
			rand.nextInt(),
			rand.nextInt(),
			rand.nextInt()
		};


		double [] dbls2 = {
			rand.nextDouble(),
			rand.nextDouble(),
			rand.nextDouble(),
			rand.nextDouble()
		};


		System.out.println(Arrays.toString(bools2));
		System.out.println(Arrays.toString(ints2));		
		System.out.println(Arrays.toString(dbls2));

		Object[] objs2 = {new Object(), new Object(), new Object()};
		System.out.println(Arrays.toString(objs2));

		String[] str3 = new String[3];
		str3[0]=randomString(5+rand.nextInt(4));
		str3[1]=randomString(5+rand.nextInt(4));
		str3[2]=randomString(5+rand.nextInt(4));

		System.out.println(Arrays.toString(str3));
	}
		
		
	

	public static String randomString(int length) {
      	 	Random rand = new Random();
        	byte[] bytes = new byte[length];
        	rand.nextBytes(bytes);
       		bytes[0] = (byte)('A' + Math.abs(bytes[0] % 26));
        	for(int i = 1; i < length; i++) {
            		bytes[i] = (byte)('a' + Math.abs(bytes[i] % 26));
        	}
        	return new String(bytes);
    	}
}
