package assignment04;

import java.util.ArrayList;

public class BunnyFarm {
    private ArrayList<Bunny> bunnies;

    public BunnyFarm() {
        this.bunnies = new ArrayList<Bunny>();
    }

    public void addBunny(Bunny bunny) {
        this.bunnies.add(bunny);
    }

    public ArrayList<Bunny> getBunnies() {
        return this.bunnies;
    }

	public int count(){
		return this.bunnies.size();
	}
	
	public int lengthSum(){
		int sum = 0;
		for (int i = 0; i < this.bunnies.size(); i++){
			sum = sum + bunnies.get(i).getName().length();
		}
		return sum;
	}
}
