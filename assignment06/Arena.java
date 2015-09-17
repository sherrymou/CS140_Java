package assignment06;

public class Arena{
	/**
	This method return the winner of a battle where first and second take turns 
	attacking' the other. The first one with an HP at or below 0 loses (meaning 
	return the other one). The first object always attacks first.
	
	@param first: the first thing to fight
	@param second: the second thing to fight
	@return: the winner who beat the other one. 
	*/
	public static Thing battle(Thing first, Thing second){
		Thing winner = new Thing(0,0);
		while (first.getHP() > 0 && second.getHP() > 0){
			first.attack(second);
			if (second.getHP() <= 0){
				winner = first;}else{
				second.attack(first);
				if (first.getHP()<=0){
					winner = second;
				}
			}
		}
		return winner;
	}
}