int arrLen = 0;
	int[] paths = new int[1000];
	public void rootToLeaf(Node root){
		if(root == null)
			return;
		
		paths[arrLen] = root.data;
		arrLen++;
		
		rootToLeaf(root.left);
		rootToLeaf(root.right);
		
		if(root.left == null && root.right == null)
			printArray();
		arrLen--;
	}
	
	public void printArray(){
		for(int i=0; i<arrLen ; i++)
			System.out.print(paths[i]+" ");
		System.out.println("");
	}
	