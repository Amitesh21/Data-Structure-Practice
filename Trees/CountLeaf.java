int count = 0;
	public int countLeaf(Node root){
		
		if(root == null)
			return 0;
		
		if(root.left != null)
			countLeaf(root.left);
		if(root.right != null)
			countLeaf(root.right);
		
		if(root.left == null && root.right == null)
			count ++;
		return count; 
	}