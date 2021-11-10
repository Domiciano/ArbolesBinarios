package model;

public class Node {
	
	private int key;
	private String value;
	
	
	//Enlaces
	private Node left;
	private Node right;
	
	
	public Node(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public void insert(int newkey, String value) {
		if(newkey<this.key) {
			//insertar a la izquierda
			if(this.left == null) {
				this.left = new Node(newkey,value);
			}else {
				this.left.insert(newkey, value);
			}
			
		}else {
			//insertar a la derecha
			if(this.right == null) {
				this.right = new Node(newkey, value);
			}else {
				this.right.insert(newkey, value);
			}
		}
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
	
	
	

}
