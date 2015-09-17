package exam01;

import java.util.ArrayList;

public class Q3 {
    public ArrayList<Integer> keepOddElements(ArrayList<Integer> list) {
        // return an `ArrayList<Integer>' where only the elements
        // at odd indices in `list' are kept.
        // Assume `list is not null.
		ArrayList<Integer> retVal = new ArrayList<>();
		for (int i=0; i<list.size(); i++){
			if (i%2==1){
				retVal.add(list.get(i));
			}
		}
		return retVal;
    }
}
