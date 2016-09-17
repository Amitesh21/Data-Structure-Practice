
	public void mergeTwoLists(Node l1, Node l2) {
		
		Node curr = null;
        
        if(l1 == null)
            return;
            
        if(l2 == null)
            return ;
        
        if(l1.data < l2.data ){
            curr = l1;
            l1 = l1.next;
        }
        else{
            curr = l2;
            l2 = l2.next;
        }
        Node newHead = curr;
        while( l1 != null && l2 != null){
            if(l1.data < l2.data){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        while(l1 != null){
            curr.next = l1;
            l1 = l1.next;
        }
        
        while(l2 != null){
            curr.next = l2;
            l2 = l2.next;
        }
         print(newHead);
    }