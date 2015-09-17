package lab09;

public class Driver {
	
	public static AnimalFarm go(String[] names, int[] ages){
		AnimalFarm farm = new AnimalFarm();
		for (int i=0; i<names.length; i++){
			farm.addAnimal(new Bunny(names[i],ages[i]));
		}
		return farm;
	}

}
