public int findLoopLength(Node head){
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
			int count = 1;
			slow = slow.next;
			while(slow != fast){
				slow = slow.next;
				count++;
			}
			return count;
		}
		else
			return 0;
	}