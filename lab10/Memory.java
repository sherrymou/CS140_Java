package pippin;

public class Memory {
	public static int DATA_SIZE = 512;
	private int[] data = new int[DATA_SIZE];
	
	public int getData(int index){
		return this.data[index];
	}
	
	public void setData(int index, int value){
		this.data[index] = value;
	}
	
	int[] getData(){
		return this.data;
	}
	
}
