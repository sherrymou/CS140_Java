package assignment04;

import java.util.Comparator;
import java.util.ArrayList;

public class Sorter {
	public ArrayList<Bunny> selectionSort(ArrayList<Bunny> tosort, Comparator<Bunny> comparator) {
	    // TODO implement
		ArrayList<Bunny> sorted = new ArrayList<Bunny>();
		Comparator comp = new Comparators().getBunnyComparator();
		int ultiSize = tosort.size();
		while (sorted.size()<ultiSize){
			Bunny min = tosort.get(0);
			int indMin = 0;
			int size = tosort.size();
			for (int i=0;i<size;i++){
				if (comp.compare(tosort.get(i),min)<0){
					min = tosort.get(i);
					indMin = i;
				}
				
			}
			sorted.add(min);
			tosort.remove(indMin);
		}
		return sorted;
	}
	
	
}
