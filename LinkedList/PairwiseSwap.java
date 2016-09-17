public void pairwiseSwap(){
		Node temp = head;
		while(temp != null && temp.next != null){
			int tempData = temp.data;
			temp.data = temp.next.data;
			temp.next.data = tempData;
			temp = temp.next.next;
		}
	}