package lab05;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String exercise() {
        String out = this.getName() + " is exercising, fun!";
        return out;
    }

	public boolean befriend(Animal other) {
    // TODO
		boolean willing1 = this.wantsFriends();
		boolean willing2 = other.wantsFriends();
		if (willing1 && willing2){
			return true;
		}else{return false;}
	}

	public boolean wantsFriends() {
		return false;
	}
}
