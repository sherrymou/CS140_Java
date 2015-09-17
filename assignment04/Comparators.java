package assignment04;

import java.util.Comparator;
import java.util.function.Function;
import java.util.ArrayList;

public class Comparators {

    public Comparator<Bunny> getBunnyComparator(){
		Comparator<Bunny> c = Comparator.comparingInt(Bunny::getWeight).thenComparing(
                Comparator.comparing(Bunny::getName));        
		return c;
    }// TODO implement
    

    /**
     * Return a comparator which compares bunny farms where the one with the greater
     * amount of bunnies is considered greater than the other
     */
    public Comparator<BunnyFarm> getBunnyFarmComparator() {

        return Comparator.comparingInt(BunnyFarm::count); // TODO implement
    }

    /**
     * Return a comparator for person where it first compares their names.
     * If there names are the same then it compares the amount of bunnies
     * on their farm, where the one with the greatest amount is the larger
     * of the two.
     */
    public Comparator<Person> getPersonComparator() {
		Comparator c = Comparator.comparing(Person::getName).thenComparingInt((Person p) -> p.getFarm().count());
        return c; // TODO implement
    }

    /**
     * Return a comparator for person where it first compares their names.
     * Then if those are the same then it compares the amount of bunnies
     * on the farm where the greatest amount is the larger of the two.
     * Then if those are the same it compares the length of the names
     * of all the bunnies on the farm, with the greatest sum being
     * the larger of the two.
     */
    public Comparator<Person> getPersonComparatorComplex() {
		Comparator c = Comparator.comparing(Person::getName).thenComparingInt((Person p) -> p.getFarm().count()).thenComparingInt((Person p) -> p.getFarm().lengthSum()); 
        return c; // TODO implement
    }
}
