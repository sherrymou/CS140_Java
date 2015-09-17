package lab04;

public class Bunny implements Comparable<Bunny> {
    private String name;
	private int weight;

	public Bunny(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

    public String getName() {
        return this.name;
    }

	public int getWeight() {
    // TODO implement
		return this.weight;
	}

	//Add the compareTo method:
	@Override
	public int compareTo(Bunny other) {
		// TODO implement
		int weight1 = this.weight;
		int weight2 = other.weight;
		if (weight1 != weight2){
			return weight1-weight2;
		}else{
		return name.compareTo(other.name);
		}
	}
}
