public void swapFirst_Last(){
		Node p = null;
		Node q = head;
		if(head == null || head.next == null){
			System.out.println("insufficient size");
			return;
		}
		
		while(q.next != null){
			p = q;
			q = q.next;
		}
		p.next.next = head.next;
		head.next = null;
		Node temp = p.next;
		p.next = head;
		head = temp;
	}