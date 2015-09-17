package pippin;

public class Memory {
	public static int DATA_SIZE = 512;
	private int[] data = new int[DATA_SIZE];
	private int changedIndex = -1;
	
	public int getData(int index){
		return this.data[index];
	}
	
	public void setData(int index, int value){
		this.data[index] = value;
	}
	
	int[] getData(){
		return this.data;
	}

	public int getChangedIndex() {
		return changedIndex;
	}
	
	public void clear(){
		for (int elements:data){
			elements = 0;
		}
		changedIndex = -1;
	}
	
}
