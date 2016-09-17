
public class Node {
	int data;
	Node left, right, parent;
	
	public Node(int data){
		this.data = data;
	}
	
	public void setLeft(Node n){
		this.left = n;
		if(n != null)
			n.parent = this;
	}
	
	public void setRight(Node n){
		this.right = n;
		if(n != null)
			n.parent = this;
	}
}
