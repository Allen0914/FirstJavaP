package p01;

public class TestAbsClass {
	
	public static void main(String args[]){
		Node node = new Node(2);
		node.addBoth(1, 3);
		System.out.println(node.right);
		new TestAbsClass().change(node);
		System.out.println(node.right);
	}
	
	public void change(Node node){
		node.right = new Node(5);
	}
}
