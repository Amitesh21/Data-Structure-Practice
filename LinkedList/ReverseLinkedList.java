public void reverseLinkedList(Node head){
		Node prevNode = null;
		Node currNode = head;
		Node nextNode = currNode.next;
		System.out.println("reverse: ");
		while(currNode != null){
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
			if(currNode != null)
				nextNode = currNode.next;
		}
		head = prevNode;
		print(head);
	}