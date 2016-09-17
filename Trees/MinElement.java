public void minElement(){
		Node curr = root;
		if(curr == null)
			return;
		else{
			while(curr.left != null)
				curr = curr.left;
		}
		
		System.out.println("min element: "+curr.data);
	}