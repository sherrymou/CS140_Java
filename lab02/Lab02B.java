package lab02;

import java.awt.Rectangle;

public class Lab02B {

	private Rectangle rect = new Rectangle();

	public Lab02B(int[] numbers) {
		//Constructor
		if (numbers.length >=4) {
			Rectangle rect = new Rectangle(numbers[0],
				numbers[1],numbers[2], numbers[3]);
		}else{
			Rectangle rect=new Rectangle (0,0,0,0);
		}

	}
	public int area() {
		return rect.width * rect.height;
	}
		

	}	
