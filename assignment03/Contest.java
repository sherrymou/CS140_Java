package assignment03;
import java.util.ArrayList;
/**
There is a contest at the local farmers' market! Each person is to take the sum of the lengths of each of their bunnies' names. The person where the sum is the greatest is the winner! 
*/

public class Contest{
	public Person run(ArrayList<Person> people){
		//Create a Array list to store lengths of each farm.
		ArrayList<Integer> lengths = new ArrayList<>();
 
		//Calculate the lengths of farm's bunnies
		for (Person i:people){
			int lengthSum = 0; //Initiate length
			BunnyFarm farm = i.getFarm(); //Get farm
			ArrayList<Bunny> bunnies = farm.getBunnies();
			// Sum up a single farm's bunnies' name
			for (Bunny j:bunnies){
				String name = j.getName();
				lengthSum = lengthSum + name.length();
			}
			
			//Add the sum of length to the array list
			lengths.add(lengthSum);		
		}


		//Sort the longest lengths of farm
		int longest = 0; // initial longest value
		int ind = 0; //initial the index where store the longset value
		for (int i=0;i<lengths.size();i++){
			int temp = lengths.get(i);

			if (temp>longest){
				longest = temp;
				ind = i;
			}
		
				
		}
		return people.get(ind);


	}
}
