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
         
      public void addfirst(int data){
         //step 1 - create new Node
         Node newNode = new Node(data);
         size++;
         if(head == null) {
             head = tail = newNode;
             return;
         }
         //step 2 - newnode next = head
         newNode.next = head; //linking Node
         
         //step 3 - head = new Node
         head = newNode;
         
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
            System.out.println();        
		}
        

        public void zigzag(){
            
            //find middle
            Node slow = head; 
            Node fast = head.next;
            
            while(fast!= null && fast.next != null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid = slow;        //slow is my middle
            
            //reverse 2nd half
            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;
            
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            
            Node left = head;
            Node right = prev;
            Node nextL, nextR;
            
            //alt zig-zag merge
            while(left != null && right != null){
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;
                
                //update
                right = nextR;
                left = nextL;
            }
        }
        
        public static void main(String[] args) {
	    Main ll = new Main();
	    ll.addfirst(5);
	    ll.addfirst(4);
	    ll.addfirst(3);
	    ll.addfirst(2);
	    ll.addfirst(1);
	    
	    ll.print();    
	    ll.zigzag(); 
	    ll.print();
            
        }
    
}	

