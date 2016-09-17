public Node lowestCommonAncestor(int data1 , int data2){
		Node curr = root;
		while(curr != null){
			if(curr.data > data1 && curr.data > data2)
				curr = curr.left;
			else if(curr.data < data1 && curr.data < data2)
				curr = curr.right;
			else
				break;
		}
		return curr;
	}