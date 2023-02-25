public class Main // or public class linked list
{
    public static class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data=data;
            this.next=null; 
            this.prev = null;
        }
        
    }    
     public static Node head;
     public static Node tail;
     public static int size;
     
     
      public void addfirst(int data){
         //step 1 - create new Node
         Node newNode = new Node(data);
         size++;
         if(head == null) {
             head = tail = newNode;
             return;
         }
         //step 2 - newnode next = head, 
         newNode.next = head; //linking Node
         head.prev = newNode;
         
         //step 3 - head = new Node
         head = newNode ;
        }
     
        public void reverse() {
            Node curr = head; 
            Node prev = null;
            Node next;
            
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                curr.prev= next;
                
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    
        public void print() {
            if(head == null){
             System.out.println("LL is empty");		
             return;
            }/
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
            System.out.println("null");        
		}
        public static void main(String[] args) {
	    Main dll = new Main();
	    dll.addfirst(3);
	    dll.addfirst(2);
	    dll.addfirst(1);
	    //ll.addlast(4);
	    //ll.addlast(5);
	    //ll.addmiddle(2,3);
	    dll.print();
	    dll.reverse();
	    dll.print();
    }   
}	
