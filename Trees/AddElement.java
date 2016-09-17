public void addElement(int data){
		Node n = new Node(data);
		if(root == null)
			root = n;
		else{
			Node prev = root;
			Node curr = root;
			while(curr != null){
				prev = curr;
				if(curr.data > data)
					curr = curr.left;
				else
					curr = curr.right;
			}
			
			if(prev.data > data )
				prev.setLeft(n);
			else
				prev.setRight(n);
		}
	}