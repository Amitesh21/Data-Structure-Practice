public int listLength(Node head){
		int length = 0;
		while(head != null){
			length ++;
			head = head.next;
		}
		return length;
	}