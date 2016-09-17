public void insertedIntoSorted(int data){
		Node p = null;
		Node q = head;
		Node n = new Node(data);
		while(q != null && q.data < data){
			p = q;
			q = q.next;
		}
		
		if(p == null){
			n.next = head;
			head = n;
		}
		else{
			n.next = p.next;
			p.next = n;
		}
	}