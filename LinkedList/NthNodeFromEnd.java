public void nthNodeFromEnd(Node head , int pos){
		if(head==null){
			System.out.println("Empty List");
			return;
		}
		
		Node fast = head;
		Node slow = null;
		
		for (int i=1 ; i<pos ; i++) {
			if(fast!=null)
				fast = fast.next;
		}
		
		while(fast!=null){
			if(slow ==null)
				slow = head;
			else
				slow = slow.next;
			fast = fast.next;
		}
		
		if(slow != null)
			System.out.println(pos+" element from last: "+slow.data);
		else
			System.out.println("enter valid pos");
	}