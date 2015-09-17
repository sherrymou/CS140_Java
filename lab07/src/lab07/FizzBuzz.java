package lab07;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10000; i++){
			if (i%3 == 0 && i%5 != 0){
				System.out.println("fizz");
			}
			if (i%5 == 0 && i%3 != 0){
				System.out.println("buzz");
			}
			
			if (i%3 == 0 && i%5 ==0){
				System.out.println("fizzbuzz");
			}
		}

	}
}
