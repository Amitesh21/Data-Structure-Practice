public int deleteFromEnd(){
		if(isEmpty()){
			System.out.println("Empty linked list");
			return 0;
		}
		else{
			Node p = head ;
			Node q = head.next;
			while(q.next != null){
				p=q;
				q=q.next;
			}
			System.out.println("deleted element: "+q.data);
			p.next = null;
			return q.data;
		}
	}