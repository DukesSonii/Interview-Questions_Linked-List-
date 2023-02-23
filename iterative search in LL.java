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
        
        public void addmiddle(int idx, int data){
         Node newNode = new Node(data);
         Node temp = head;
         int i =0; 
         while(i<idx-1){
             temp = temp.next;
            i++;
         }
         
         //i=idx-1 i.e temp->prev
         newNode.next = temp.next;
         temp.next = newNode;
         
        }     
     // -------------------------------------ITERATIVE SEARCH ----------------------------------------
        public int search(int key){
            int idx=0;
            Node temp = head;
            
            while(temp!=null){
                if(temp.data == key){
                    return idx;
                }
                temp = temp.next; //temp ko update kia mtlb age wale ele pe jake check kia
                idx++;
            }
            return -1;
        }    
    // -------------------------------------ITERATIVE SEARCH ----------------------------------------      
  
  
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
        
        public static void main(String[] args) {
	    Main ll = new Main();
	     ll.addfirst(2);
	    ll.addfirst(1);
	    ll.addlast(4);
	    ll.addlast(5);
	    ll.addmiddle(2,3);
	    ll.print();
	    
	    System.out.println(ll.search(3));
	    System.out.println(ll.search(11));  //since 11 is not therer 
        
    }   
    
}	
