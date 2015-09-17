package lab04;

import java.util.ArrayList;
import java.util.Collections;

public class Contest {
    public ArrayList<Person> run(ArrayList<Person> people) {
        // return an arraylist where the first place person is at index 0
        // the second place person is at index 1, etc.
        // that is, the arraylist should be arranged where
        // the winner is at the front and the absolute loser
        // is at the end
		Collections.sort(people);
		Collections.reverse(people);
		return people;
    }
}
