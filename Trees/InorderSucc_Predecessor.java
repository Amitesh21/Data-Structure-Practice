public void inorderSucc_Predecessor(int data){
		Node curr = root;
		
		if(curr == null)
			return;
		else{
			while(curr != null && curr.data != data){
				if(data < curr.data)
					curr = curr.left;
				else
					curr = curr.right;
			}
			
			if(curr == null){
				System.out.println("Element not found");
				return;
			}
			
			Node temp = curr;
			if(curr.right == null){
				System.out.println("inorderPredecessor not exist");
			}
			else{
				curr = curr.right;
				while(curr.left != null)
					curr = curr.left;
				System.out.println("inorderPredecessor: "+curr.data);
			}
			
			if(temp.left == null){
				System.out.println("inorderSuccessor not exist");
			}
			else{
				temp = temp.left;
				while(temp.right != null)
					temp = temp.right;
				System.out.println("inorderSuccessor: "+temp.data);
			}
		}
	}