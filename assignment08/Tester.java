package assignment08;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
  @Test
  public void nodeTest() {
    Node a = new Node(1);
    Node b = new Node(1);
    Node c = new Node(3);

    assertTrue(a.compareTo(b) == 0);
    assertTrue(a.compareTo(c) < 0);
    assertTrue(c.compareTo(b) > 0);
  }

  @Test
  public void treeTest() {
    BinarySearchTree tree = new BinarySearchTree();
    assertEquals("", tree.toString());

    tree.insert(new Node(10));
    assertEquals("10", tree.toString());

    tree.insert(new Node(5));
    assertEquals("5 10", tree.toString());

    tree.insert(new Node(20));
    assertEquals("5 10 20", tree.toString());

    tree.insert(new Node(10));
    assertEquals("5 10 10 20", tree.toString());
  }
  
  @Test
  public void nodebTest() {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(new NodeB(10));
    assertEquals("b10", tree.toString());

    tree.insert(new NodeB(5));
    assertEquals("b5 b10", tree.toString());

    tree.insert(new NodeB(20));
    assertEquals("b5 b10 b20", tree.toString());

    tree.insert(new NodeB(10));
    assertEquals("b5 b10 b10 b20", tree.toString());
  }

  @Test
  public void mixedTest() {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(new NodeB(10));
    assertEquals("b10", tree.toString());

    tree.insert(new NodeB(5));
    assertEquals("b5 b10", tree.toString());

    tree.insert(new NodeB(20));
    assertEquals("b5 b10 b20", tree.toString());

    tree.insert(new Node(10));
    assertEquals("b5 b10 10 b20", tree.toString());

    tree.insert(new Node(10));
    assertEquals("b5 b10 10 10 b20", tree.toString());

    tree.insert(new Node(20));
    assertEquals("b5 b10 10 10 b20 20", tree.toString());
  }
  
  @Test
  public void q4(){
	  Node n1 = new Node(1);
	  Node n2 = new Node(2);
	  Node n3 = new Node(-1);
	  Node n4 = new Node(2);
	  
	  NodeB b1 = new NodeB(1);
	  NodeB b2 = new NodeB(-1);
	  
	  assertEquals(true, b1.compareTo(n1)<0);
	  assertEquals(true, b2.compareTo(n3)<0);
	  assertEquals(true, n2.compareTo(n1)>0);
	  assertEquals(true, b1.compareTo(b2)>0);
	  assertEquals(true, n2.compareTo(n4)==0);
	  assertEquals(true, b1.compareTo(n3)>0);
	  assertEquals(true, n4.compareTo(b2)>0);
  }
}