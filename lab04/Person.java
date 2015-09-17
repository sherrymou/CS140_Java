package lab04;

import java.util.ArrayList;

public class Person implements Comparable<Person> {
    private BunnyFarm bunnyFarm;
    private String name;

    public Person(String name) {
        this.name = name;
        this.bunnyFarm = new BunnyFarm();
    }

    public String getName() {
        return this.name;
    }

    public BunnyFarm getFarm() {
        return this.bunnyFarm;
    }

	public int countNames(){
		int sum = 0;
		ArrayList<Bunny> bunnies = bunnyFarm.getBunnies();
		for (int i = 0; i < bunnies.size(); i++){
			sum = sum + bunnies.get(i).getName().length();
		}
		return sum;
	}

	@Override
	public int compareTo(Person other){
		//TODO implement
		int length1 = this.countNames();
		int length2 = other.countNames();
		if (length1 > length2){
			return 1;
		}else if (length1 < length2) {
			return -1;
		}else{
			return name.compareTo(other.name);
		}
	}
}
