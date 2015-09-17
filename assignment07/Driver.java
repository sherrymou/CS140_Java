package assignment07;

public class Driver{
	
	public static int countDiv(int maxNum, int deno, int rem){
		int tmp = 0;
		for (int i=0; i<maxNum; i++){
			if (i%deno==rem){
				tmp +=1;
			}
		}
		return tmp;
	}

	public static int firstDigit(int number){
		while (number > 9){
			number /=10;
		}
		return number;
	}

	public static int[] getArray(int max){
		int[] retVal = new int[97];

		//index 0: the number of even numbers between 0 and max
		retVal[0] = countDiv(max,2,0);

		//index 1: the number of odd numbers between 0 and max
		retVal[1]= countDiv(max,2,1);

		//index 2: the number of prime numbers between 0 and max
		int tmp = 1;	
		for (int i =3; i<max; i++){
			boolean mark  = true;
			for (int j=2; j<i; j++){
				if (i%j==0){
					mark = false;
				}
			}
			if (mark){
				tmp +=1;
			}
		}
		retVal[2] = tmp;

		//index 3-22  the number of numbers between 0 and max 
		//divisible by (1 (inclusive) to 20 (inclusive))
		for (int i= 1; i<=20; i++){
			retVal[i+2] = countDiv(max,i,0);
		}

		//index 23-77
		retVal[23]=max;

		int index = 24;
		for (int i = 2; i<=10; i++){
			for (int j =0; j<max; j++){
				for (int k = 0; k< i; k++){
					if (j%i==k){
						retVal[index+k]+=1;
					}
				}
			}
			index +=i;
		}

		// index 78-86
		for (int i = 0; i<max; i++){
			for (int j = 1; j<=9; j++){
				if (firstDigit(i)==j){
					retVal[index+j-1]+=1;
				}
			}
		}

		// index 87-96
		index =87;
		retVal[87]=1;
		for (int i = 0; i<max; i++){
			for (int j = 0; j<=9; j++){
				tmp = i;
				while ( tmp > 0){
					if (tmp%10 == j){
						retVal[index+j]+=1;
						tmp =0;
					}
					tmp /=10;
				}
			}
		}
		return retVal;

	}	

}
