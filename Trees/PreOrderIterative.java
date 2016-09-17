void preOrderIterative(Node root) {
	    Stack<Node> s = new Stack<Node>();
	    s.push(root); 
	    Node temp;
	    while(!s.isEmpty()){
	    	temp = s.pop();
	    	System.out.print(temp.data+" --> ");
	    	
	    	if(temp.right != null)
	    		s.push(temp.right);
	    	
	    	if(temp.left != null)
	    		s.push(temp.left);
	    }
	}
	