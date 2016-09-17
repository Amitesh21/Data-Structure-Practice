public void insertAtEnd(int data){
		Node n = new Node(data);
		if(head ==null)
			head = n;
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = n;
//			n.next = head.next.next;
		}
	}