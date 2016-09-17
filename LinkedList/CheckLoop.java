public Node checkLoop(Node head){
		Node fast = head;
		Node slow = head;
		boolean loopExist = false;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				loopExist = true;
				break;
			}
		}
		if(loopExist){
			slow = head;
			int count = 0;
			while(slow != fast){
				count++;
				slow = slow.next;
				fast = fast.next;
			}
			System.out.println("loop length: "+count);
			return fast;
		}
		else return null;
	}