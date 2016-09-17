public void print(Node head){
		if(!isEmpty()){
			Node temp = head;
			while(temp!=null){
				System.out.print(temp.data+" --> ");
				temp = temp.next;
			}
			System.out.println("Null");
		}
		else
			System.out.println("Empty list");
	}