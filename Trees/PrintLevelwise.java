public void printLevelwise(Node root){
		if(root == null)
			return;
		
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		q.offer(null);
		Node curr = null;
		while(!q.isEmpty()){
			curr = q.poll();
			if(curr == null){
				System.out.println("");
				q.offer(null);
				curr = q.poll();
			}
			if(curr == null)
				return;
			
			if(curr.left != null)
				q.offer(curr.left);
			
			if(curr.right != null)
				q.offer(curr.right);
			System.out.print(curr.data+" ");
		}
	}