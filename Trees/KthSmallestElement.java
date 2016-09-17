public void kthSmallestElement(int k){
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		int count = 1;
		while(!s.isEmpty() || curr != null){
			if(curr != null){
				s.push(curr);
				curr = curr.left;
			}
			else{
				curr = s.pop();
				if(count == k){
					System.out.println("kth smallest element: "+curr.data);
					return;
				}
				count++;
				curr = curr.right;
			}
		}
	}