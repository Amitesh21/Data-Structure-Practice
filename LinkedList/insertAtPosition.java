public void insertAtPosition(int data, int pos){
		int count =0;
		Node n = new Node(data);
		if(!isEmpty()){
			Node p=head;
			Node q = head.next;
			while(pos!=count){
				p = q;
				q = q.next;
				count++;
			}
			p.next = n;
			n.next = q;
		}
		else
			System.out.println("Empty list");
	}
	