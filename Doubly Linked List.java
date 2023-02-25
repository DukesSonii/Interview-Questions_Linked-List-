public class Main // or public class linked list
{
    public static class Node{
        int data;
        Node next;
        Node prev;vb
        
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
     
      public void addlast(int data){
         //step 1 - create new Node
         Node newNode = new Node(data);
         size++;
         if(head == null) {
             head = tail = newNode;
             return;
         }
         tail.next = newNode; //linking Node
         tail = newNode;
        }
        
        public int removfirst(){
            if(head == null){
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
            }
            
            if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val ;
            }
            
            int val = head.data;
            head = head.next;
            head.prev = null;       //giv error for single node so write b.c for size == 1
            size--;
            return val;
            
        }
        
    
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
	    System.out.println(dll.size);
	    
	    dll.removfirst();
	    dll.print();
	    System.out.println(dll.size);
	    dll.removfirst();
	    dll.print();
        	    System.out.println(dll.size);

    }   
    
}	
