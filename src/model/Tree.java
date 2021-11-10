package model;

public class Tree {

	private Node root;

	public void add(int key, String value) {
		if (root == null) {
			root = new Node(key, value);
		} else {
			root.insert(key, value);
		}
	}

	// El activador del método recursivo
	public void triggerInorder() {
		inorder(root);
	}

	// Recursivo
	public void inorder(Node node) {
		// Caso base
		if (node == null) {
			return;
		}
		// Recursivo

		inorder(node.getLeft());
		System.out.println(node.getKey());
		inorder(node.getRight());
	}

	public Node triggerSearch(int key) {
		return search(root, key);
	}

	// Recursivo
	public Node search(Node node, int key) {
		// Caso base
		if (node == null) {
			return null;
		}

		if (key == node.getKey()) {
			return node;
		}
		// Procedimiento recursivo
		if (key < node.getKey()) {
			return search(node.getLeft(), key);
		} else {
			return search(node.getRight(), key);
		}

	}

	
	public void triggerMaxLevel() {
		int level = getMaxLevel(root, 1);
		System.out.println(level);
	}

	public int getMaxLevel(Node node, int level) {

		if (node == null) {
			return level-1;
		} else {

			int A = getMaxLevel(node.getLeft(), level + 1);
			int B = getMaxLevel(node.getRight(), level + 1);

			return Math.max(A, B);
		}

	}

}
