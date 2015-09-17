package assignment08;

public class Node implements Comparable<Node>{
	private int data;
	private Node left;
	private Node right;
	
	public Node(int aData){
		this.data = aData;
		this.left=null;
		this.right=null;
	}
	
	public int getData(){
		return this.data;
	}
		
	@Override
	public int compareTo(Node other) {
		return this.getData()-other.getData();
	}

	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setLeft(Node node){
		this.left = node;
	}
	
	public void setRight(Node node){
		this.right = node;
	}
	
	public int count()
	{
		int count = 0;
		if (this.getLeft()!=null){
			count ++;
		}
		if (this.getRight()!=null)
		{
			count ++;
		}
		return count;
	}
	
	public void insert(Node node)
	{
		if(this.compareTo(node)<0){
			if (this.getRight()==null){
				this.setRight(node);
			}else{
				this.getRight().insert(node);
			}
		}else{
			if (this.getLeft()==null){
				this.setLeft(node);
			}else{
				this.getLeft().insert(node);
			}
		}
	
	}
	
}

