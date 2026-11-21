package AddTwoNumbers;

public class AddTwoNumbers {
	    
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		
        ListNode l3 = new ListNode();
        int carry = 0;

        ListNode current = l3;

        while (l1 != null || l2 != null || carry != 0) {
        	
        	int sum = carry; 
        	
        	if (l1 != null) {
        		sum += l1.val;
        		l1 = l1.next;
        	}
        	if (l2 != null) {
        		sum += l2.val;
        		l2 = l2.next;
        	}
        	carry = sum / 10;
        	current.next = new ListNode(sum % 10);
        	current = current.next;
        	
        }
        
        return l3.next;
    }
	
	
	public static void main(String[] args) {
		
		System.out.println("Add Two Numbers:");
		ListNode a = new ListNode(9);
		ListNode b = new ListNode(9);
		ListNode c = new ListNode(9);
		ListNode d = new ListNode(9);
		ListNode e = new ListNode(9);
		ListNode f = new ListNode(9);
		ListNode g = new ListNode(9);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		
		ListNode h = new ListNode(9);
		ListNode i = new ListNode(9);
		ListNode j = new ListNode(9);
		ListNode k = new ListNode(9);
		
		h.next = i;
		i.next = j;
		j.next = k;
		
		ListNode answer = addTwoNumbers(a,d);
		
		ListNode current = answer;
		while (current != null) {
			System.out.print(current.val);
			
			current = current.next;
		}
		

	}

}
