package assignment02;

/**
Create rectangles and compute their areas.
@author Keni Mou 
*/

import java.awt.Rectangle;

public class Lab02B {

	private Rectangle rect;

	public Lab02B(int[] numbers) {
		//Constructor
		if (numbers.length >= 4) {
			this.rect = new Rectangle(numbers[0],
				numbers[1],numbers[2], numbers[3]);
			
		}else{
			this.rect = new Rectangle(0,0,0,0);
		}

	}

	public int area() {
		int area=rect.width * rect.height;
		return area;
	}

	public int getX(){
		return rect.x;
	}

	public int getY(){
		return rect.y;
	}

}	
