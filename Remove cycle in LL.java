public class Main // or public class linked list
{
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null; 
        }
        
    }    
     public static Node head;
     public static Node tail;
     public static int size;
    
        public void print() {
            if(head == null){
             System.out.println("LL is empty");		
             return;
            }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
            System.out.println();        
		}
     public static  void removecycle() {
             //detect cycle
             Node slow = head;
             Node fast = head;
             boolean cycleexist = false;
             while(fast!= null && fast.next!=null){
                 slow = slow.next;
                 fast = fast.next.next;
                 if(fast == slow){
                     cycleexist = true;     
                     break;
                 }
             }
             if(cycleexist == false){
                return;     //cycle exist nh krti toh code se return kr jao
             } 
            
             //if exist then
             //find meetinh point 
             slow = head;
             Node prev = null;		//prev purane fast ko print krega
             while(slow != fast){   //2nd time meet kar gaye
                 prev = fast;
                 slow = slow.next;
                 fast = fast.next;
             }
             
             
            // remove cycle  -> last.next = null prev = lasrtNode or cycle ko remove kren ke liye pehle ussse found kia
			//	i.e prev phir usse null point bana dia i.e prev.net= null
            prev.next = null;
         }

        public static void main(String[] args) {
	            head = new Node(1);
	            Node temp = new Node(2);
	            head.next =  temp;
                head.next.next = new Node(3);
                head.next.next.next = temp; 
                //1->2->3->1
                System.out.println(iscycle());
                removecycle();
                System.out.println(iscycle());
        }
}	
