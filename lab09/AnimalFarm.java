package lab09;

import java.util.ArrayList;

public class AnimalFarm {
	private ArrayList<Animal> animals;
	
	public AnimalFarm (){
		animals = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal a){
		animals.add(a);
	}
	
	public ArrayList<Animal> getAnimals(){
		return animals;
	}
	
	public Animal lookup(String name){
		for (Animal a:animals){
			if (a.getName() == name){
				return a;
			}
		}
		return null;
	}
}
