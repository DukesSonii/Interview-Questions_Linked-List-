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
     
    public void print() {
        if(head == null){
            System.out.println("LL is empty");		T.C=O(n)
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
	    ll.print();
	    ll.addlast(2);
	    ll.print();
	    ll.addlast(1);
	    ll.print();
	    ll.addlast(3);
	    ll.print();
	    ll.addlast(4);
	    ll.print();
	    
    }   
    
}
