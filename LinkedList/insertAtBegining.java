public void insertAtBegining(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
	}