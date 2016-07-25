package p01;

public class Tree2List {
	Node start;
	Node head;

	public static void main(String[] args) {
		Tree2List t = new Tree2List();
		Node root = t.construct();
		int height = t.getHeight(root);
		System.out.println(height);
		
	}
	
	public int getHeight(Node node){
		if(node==null)
			return 0;
		int left = getHeight(node.left);
		int right = getHeight(node.right);
		return right>left ? right+1:left+1;
	}
	
	public Node construct(){
		Node root = new Node(10);
		root.addBoth(6, 14);
		root.left.addBoth(4, 8);
		root.right.addBoth(12, 16);
		return root;
	}
	
	public static void printList(Node node){
		System.out.println("start output:::::");
		while(node!=null){
			System.out.print(node.data+"--->");
			node = node.right;
		}
	}
	
	public void convert(Node root){
		if(root == null){
			start = null;
			return;
		}
		if(root.left!=null){
			convert(root.left);
		}
		
		if(start!=null){
			start.right=root;
			root.left = start;
		}
		start = root;
		if(head==null){
			head = start;
		}
		System.out.println("start:"+start);
		
		
		if(root.right!=null){
			convert(root.right);
		}
	}
	
	
	

}
