static int count = 0;
	public void nthNodeFromEnd_Recursion(Node head , int pos){
		
		if(head != null)
			nthNodeFromEnd_Recursion(head.next , pos);
			count++;
			if(count == pos+1){
				System.out.println(head.data);
				return;
			}
	}