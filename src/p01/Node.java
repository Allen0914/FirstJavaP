package p01;

public class Node{
	int data;
	Node left, right;
	
	public Node(int data){
		this.data = data;
	}
	
	public void addBoth(Node left, Node right){
		this.left = left;
		this.right = right;
	}
	
	public void addLeft(Node node){
		this.left = node;
	}
	
	public void addRight(Node node){
		this.right = node;
	}
	
	
	public void addBoth(int lData, int rData){
		this.left = new Node(lData);
		this.right = new Node(rData);
	}
	
	public void addLeft(int lData){
		this.left = new Node(lData);
	}
	
	public void addRight(int rData){
		this.right = new Node(rData);
	}
	
	public static void preList(Node node){
		if(node.left!=null){
			preList(node.left);
		}
		System.out.print("-->"+node.data);
		if(node.right!=null){
			preList(node.right);
		}
	}
	
	public String toString(){
		return "data:"+data;
	}
	
	public boolean hasLeft(){
		if(this.left!=null){
			return true;
		}
		return false;
	}
	
	public boolean hasRight(){
		if(this.right!=null){
			return true;
		}
		return false;
	}
	
	
}
