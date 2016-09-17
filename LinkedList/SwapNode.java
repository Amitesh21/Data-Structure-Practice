public void swapNode(int node1, int node2){
		if(node1 == node2)
			return;
		
		Node prevX = null, currX = head;
		while(currX !=null && currX.data != node1){
			prevX = currX;
			currX = currX.next;
		}
		
		Node prevY = null, currY = head;
		while(currY !=null && currY.data != node2){
			prevY = currY;
			currY = currY.next;
		}
		
		if(currX == null || currY == null)
			return;
		
		if (prevX != null) 
			prevX.next = currY;
		else
			head = currY;
		
		if (prevY != null) 
			prevY.next = currX;
		else
			head = currX;
		
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}