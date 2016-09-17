public void sortedListIntersection(Node head1, Node head2){
		if(head1 == null || head2 == null)
			return;
		System.out.println("Intersecting List: ");
		while(head1 != null && head2 != null){
			if (head1.data == head2.data){
				System.out.print(head1.data+" --> ");
				head1 = head1.next;
				head2 = head2.next;
				continue;
			}
			
			if (head1.data < head2.data)
				head1 = head1.next;
			else
				head2 = head2.next;
		}
		System.out.println("Null");
	}