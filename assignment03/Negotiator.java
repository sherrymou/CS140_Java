package assignment03;

public class Negotiator{
	public void trade(String name, Person from, Person to){
		BunnyFarm farmFrom = from.getFarm();
		BunnyFarm farmTo = to.getFarm();
	
		// search for bunny in 'from'
		Bunny tradeOne = farmFrom.findBunny(name);
		// remove bunny from 'from'
		farmFrom.removeBunny(tradeOne);
		// add bunny to 'to'
		farmTo.addBunny(tradeOne);
	}


}
