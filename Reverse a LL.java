public void reverse(){
            Node prev = null;
            Node curr =head;
            Node next;
            
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev; //prev is new head prev aage badte badte 5 tak aajayaga isliye prev = head
        }   
	
