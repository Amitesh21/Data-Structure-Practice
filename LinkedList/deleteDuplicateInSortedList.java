public void deleteDuplicateInSortedList(Node head){
		if(head == null)
			return;
		
		while(head.next != null){
			if (head.data == head.next.data)
				head.next = head.next.next;
			else
				head = head.next;	
		}
	}