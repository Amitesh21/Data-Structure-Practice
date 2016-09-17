public int maxLevelSum(Node root){
		
		if(root == null)
			return -1;
		
		int sum = 0, maxSum = Integer.MIN_VALUE;
		Queue<Node> q = new LinkedList<Node>();
		Node curr = null;
		q.offer(root);
		q.offer(null);
		
		while(!q.isEmpty()){
			curr = q.poll();
			if(curr == null){
				q.offer(null);
				if(sum > maxSum)
					maxSum = sum;
				sum = 0;
				curr = q.poll();
			}
			if(curr == null)
				return maxSum;
			
			if(curr.left != null)
				q.offer(curr.left);
			
			if(curr.right != null)
				q.offer(curr.right);
			sum += curr.data;
		}
		return 0;
	}