public class linked list
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
     
     public void addlast(int data){
         //step 1 - create new Node
         Node newNode = new Node(data);
         
         if(head == null) {
             head = tail = newNode;
             return;
         }
         tail.next = newNode; //linking Node
         tail = newNode;
        }
     
     
	public static void main(String[] args) {
	    Main ll = new Main();
	    ll.addlast(2);
	    ll.addlast(1);
	    ll.addlast(3);
	    ll.addlast(4);
	    
    }   
    
}
