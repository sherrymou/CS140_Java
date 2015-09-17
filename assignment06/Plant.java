package assignment06;

public class Plant extends Thing{
	private int hp;

	public Plant(){
		super(8,0);
	}

	@Override
	public void takeDamage(int damage){
		super. takeDamage(2*damage);
	}
}