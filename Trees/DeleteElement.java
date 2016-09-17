public void deleteElement(int data){
		
		Node curr = root;
		while(curr != null && curr.data != data){
			if(curr.data > data)
				curr = curr.left;
			else 
				curr= curr.right;
		}
		
		if(curr == null){
			System.out.println("Element is not present");
			return;
		}
		
		System.out.println("curr: "+curr.data);
		Node replacement = null;
		
//		if child node
		if (curr.left == null && curr.right == null)
			replacement = null;
		
//		if has only right child
		if (curr.left == null && curr.right != null)
			replacement = curr.right;
		
//		if has only left child
		if (curr.left != null && curr.right == null)
			replacement = curr.left;
		
//		if has both left and right child
		if (curr.left != null && curr.right != null){
			replacement = curr.right;
			
			while(replacement.left != null)
				replacement = replacement.left;
			
			Node replacement_parent = replacement.parent;
			
			if(curr != replacement_parent){
				replacement_parent.left = replacement.right;
				replacement.right = curr.right;
			}
			replacement.left = curr.left;
		}
		System.out.println("curr "+curr.data);
		Node parent = curr.parent;
		System.out.println("curr.parent "+curr.parent);
		if(parent == null)
			root = replacement;
		else{
			if(parent.left == curr)
				parent.left = replacement;
			else
				parent.right = replacement;
		}
	}