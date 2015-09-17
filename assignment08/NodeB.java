package assignment08;

public class NodeB extends Node
{
	public NodeB(int data){
		super(data);
	}
	
	@Override
	public int compareTo(Node other)
	{
		if(this.getData()==other.getData() && other instanceof NodeB==false){
			return -1;
		}else{
			return super.compareTo(other);
		}
	}
	
}