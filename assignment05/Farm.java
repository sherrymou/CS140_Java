package assignment05;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal> animals;

    public Farm() {
        this.animals = new ArrayList<Animal>();
    }

	public void addAnimal(Animal a){
		animals.add(a);
	}

	public String chorus(){
		if (animals.size()>1){
			String chorus = animals.get(0).speak();
			for (int a = 1; a < animals.size(); a++){
				chorus = chorus+"\n"+animals.get(a).speak();
			}
			return chorus;
		}else{
			return "";}
	}
}
