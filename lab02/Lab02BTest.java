package lab02;


public class Lab02BTest{

	public static void main (String[] args){

		for (int i = 0; i < args.length; i++) {
			nums[i]=Integer.parseInt(args[i]);

		Lab02B object = new Lab02B(nums);
		System.out.println(object.area());		
		
		}
	}

	public int[] nums= new int [args.length];
	
}	
