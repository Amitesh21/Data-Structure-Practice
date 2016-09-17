void rotate(int k)
    {
        if (k == 0) {
			return;
		}
        
        Node curr = head;
        
        while(k>1 && curr != null){
        	curr = curr.next;
        	k--;
        }
        if(curr == null)
        	return;
        
        System.out.println("kthnode: "+curr.data);
        
        Node kthNode = curr;
        while(curr.next != null)
        	curr = curr.next;
        
        curr.next = head;
        head = kthNode.next;
        kthNode.next = null;
    }