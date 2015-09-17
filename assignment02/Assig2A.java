package assignment02;
/**
@author Keni Mou 
*/
public class Assig2A{
	public static int simpleLargestArea(Lab02B[] objs) {
		double maxArea = 0;
		int ind = 0; 
		for (int i = 0; i < objs.length; i++){
			double area = objs[1].area();
			if (area > maxArea) {
				maxArea = area;
				ind = i;		
			}
		}
		return ind;
	}



	public static Lab02B simpleTopLeftMost(Lab02B[] objs){
		int minX = 99999;
		int minY = 99999;
	
		int ind = 0;
	
		for (int i = 0; i < objs.length; i++) {
			int x = objs[i].getX();
			int y = objs[i].getY();
			if (x< minX || (x == minX && y < minY)){
				ind = i;	
			}
		}
		return objs[ind];
	}


	public static int largestArea(Lab02B[] objs) {
		double maxArea = 0;
		int ind = -1; 

		if (objs!=null && objs.length != 0){
			for (int i = 0; i < objs.length; i++){
				if (objs[i]!=null){
					double area = objs[1].area();
					if (area > maxArea) {
						maxArea = area;
						ind = i;		
					}
				}
			}
		}
	

		return ind;
	}


/**
This method returns the Lab02B object in the array with the smallest value 
of rect.x. If two elements have the same smallest x then the first with the
smallest y is the return value. This allows the array to be null or empty 
and any of the array elements to be null. When there is no possible object 
to return, return null.

@param objs: a array contain various Lab02 objects
@return the Lab02B object in the array with the smallest value 
of rect.x. If two elements have the same smallest x then the first with the
smallest y is the return value.
*/
	public static Lab02B topLeftMost(Lab02B[] objs){
		int minX = 99999;
		int minY = 99999;
		Lab02B retObj= null; 
	
		int ind = -1;
		if (objs!=null && objs.length != 0){
			for (int i = 0; i < objs.length; i++) {
				if (objs[i]!=null){
					int x = objs[i].getX();
					int y = objs[i].getY();
					if ((x< minX) || (x == minX && y < minY)){
						minX = x;
						minY = y;
						ind = i;	
				}
				retObj = objs[ind];	
				}
			}
		}

		return retObj;
	}
}
