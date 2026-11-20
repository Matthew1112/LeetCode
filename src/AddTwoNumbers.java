import ListNode;

public class AddTwoNumbers {
	    
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode();
        int carry = 0;

        ListNode current = l3;

        if (l1 == null || l2 == null) {
            return l3;
        }

        while (true) {

            if (l1 != null && l2 != null) {

                int add = l1.val + l2.val;
                add += carry; 
                System.out.println(add);

                if(add >= 10) {
                    carry = 1;
                    add = add - 10;
                }
                else {
                    carry = 0;
                }

                current.val = add;
                l1 = l1.next;
                l2 = l2.next;

            }
            else if (l1 != null) {
            	System.out.println("?");
            	
            	int add = l1.val + carry;
            	
            	if(add >= 10) {
            		add = add - 10;
            	}
            	else {
            		carry = 0;
            	}
                current.val = add;
                l1 = l1.next;
            }
            else if (l2 != null) {
            	int add = l2.val + carry;
            	
            	if(add >= 10) {
            		add = add - 10;
            	}
            	else {
            		carry = 0;
            	}
            	current.val = add;
                l2 = l2.next;
            }
            else if (carry != 0) {
            	current.val = carry;
            	carry = 0;
            }
            
            if (l1 == null && l2 == null && carry == 0) {
            	return l3;
            }
            
            
            ListNode temp = new ListNode();
            current.next = temp;
            current = current.next;
            
        }
    }
	
	
	public static void main(String[] args) {
		
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
