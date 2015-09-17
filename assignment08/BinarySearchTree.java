package assignment08;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchTree {
	private Node root;

	//private ArrayList<Node> list;
	
	public BinarySearchTree()
	{
		this.root=null;
	}
	
	public void insert (Node node)
	{
		if (root == null){
			root = node;
		}else{
		root.insert(node);
		}
		
	}
	
	public void loop(Node node, ArrayList<Node> list) 
	{
		if (node == null)
			return;
		loop(node.getLeft(),list);
		list.add(node);
		loop(node.getRight(),list);
	}

	public ArrayList<Node> makeList()
	{
		ArrayList<Node> list = new ArrayList<>();
		loop(root,list);
		return list;
	}
	
	@Override
	public String toString()
	{
		ArrayList<Node> list = makeList();
		Collections.sort(list);
		
		String retVal = "";
		
		if (list.size()>0){
			if (list.get(0) instanceof NodeB){
				retVal +="b"+list.get(0).getData();
			}else{
			retVal += list.get(0).getData();}
			for (int i =1; i<list.size();i++)
			{
				if (list.get(i) instanceof NodeB)
				{
					retVal +=" b"+list.get(i).getData();
				}else{
				retVal += " "+list.get(i).getData();
				}
			}
		}
		return retVal;
	}

}