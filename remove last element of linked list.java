//this code only contains function, to see how to create class Node see previous code of linked list in same folder. ThankYou

public int removelast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head= tail = null;
            size = 0;
            return val;
        }
        
        //pehle loop lagake prev node tak pocha prev: i=size-2 which is prev
        Node prev= head;
        for(int i=0;i<size-2; i++){		//second last idx
            prev=prev.next; //isse size-2 wale index pe aagya
        }
        
        int val = prev.next.data; //tail.data or jis ko delete krna usko store kr lia 
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    
    
    public static void main(String[] args) {
	    Main ll = new Main();
	     ll.addfirst(2);
	    ll.addfirst(1);
	    ll.addlast(3);
	    ll.addlast(4);
	    ll.addmiddle(0,9);
	    ll.print();
	
        //ll.removeFirst();
        //ll.print();
        
        ll.removelast();
        ll.print();
        
    }   
    	
