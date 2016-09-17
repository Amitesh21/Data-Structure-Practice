public void deleteSpecificNode(int item){
		if(isEmpty())
			System.out.println("Empty list");
		else if(head.data == item){
			System.out.println("item deleted");
			head = head.next;
		}
		else{
			Node p = head;
			Node q = head.next;
			while( q.next != null ){
				if(q.data == item){
					p.next = q.next;
					System.out.println("Item deleted");
				}
				p=q;
				q=q.next;
			}
		}
	}