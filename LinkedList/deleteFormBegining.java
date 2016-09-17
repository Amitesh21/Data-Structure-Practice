public int deleteFormBegining(){
		if(isEmpty()){
			System.out.println("Empty linked list");
			return 0;
		}
		else{
			System.out.println("Element deleted: "+head.data);
			int temp = head.data;
			head = head.next;
			return temp;
		}
	}