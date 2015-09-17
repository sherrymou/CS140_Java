package lab05;

public class Bear extends Animal {

	private boolean hibernating = false;

    public Bear(String name) {
        super(name);
    }

	public void hibernate(){
		hibernating = true;
	}

	@Override
	public String exercise() {
    // If the bear is hibernating, then return
    // a sentence saying "NAME is hibernating and can't exercise."
    // where NAME is replaced with the bear's name.
    // You must return exactly this or the JUnit test
    // will not be correct.
		String name = super.getName();	
		String sentence ="";	
	
		if (hibernating == true){
			sentence = (name + " is hibernating and can't exercise.");
		
    //
    // If the bear is not hibernating, then
    // return exactly what the superclass's
    // version of exercise returns
    // (hint: you can accomplish this by
    // calling super.exercise())

		}else{
			sentence = super.exercise();
				}
		return sentence;
	}

	@Override
	public boolean wantsFriends() {
		return false;
	}
}


