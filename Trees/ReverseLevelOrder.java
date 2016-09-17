public void reverseLevelOrder(Node root){
		
		if(root == null)
			return;
		
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<Node>();
		Node curr = null;
		q.offer(root);
		while(!q.isEmpty()){
			curr = q.poll();
			
			if(curr.left != null)
				q.offer(curr.left);
			
			if(curr.right != null)
				q.offer(curr.right);
			
			s.push(curr);
		}
		
		while(!s.isEmpty()){
			System.out.print(s.pop().data+" ");
		}
	}
	