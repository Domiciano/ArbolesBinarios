package main;

import model.Node;
import model.Tree;

public class Main {

	public static void main(String[] args) {
		Tree t = new Tree();
		
		t.add(10, "A");
		t.add(-2, "B");
		t.add(4, "C");
		t.add(15, "D");
		t.add(20, "E");
		t.add(-60, "F");
		t.add(25, "G");
		
		
		t.triggerInorder();
		
		Node node = t.triggerSearch(5);
		if(node == null) {
			System.out.println("No se encontró nada");
		}else {
			System.out.println(node.getKey());
			System.out.println(node.getValue());
		}
		
		t.triggerMaxLevel();
		
		
	}

}
