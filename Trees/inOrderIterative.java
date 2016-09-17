public void inOrderIterative(Node root) {
	    Stack<Node> s = new Stack<Node>();
	    Node curr = root;
	    
	    while(!s.isEmpty() || curr != null ){
	        if(curr != null){
	            s.push(curr);
	            curr = curr.left;
	        }
	        else{
	            curr = s.pop();
	            System.out.print(curr.data+" ");
	            curr = curr.right;
	        }
	    }
	}