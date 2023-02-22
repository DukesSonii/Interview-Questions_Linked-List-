public class linked list
{
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.null=null; 
        }
        
    }    
	//abh ll ke andar ek hi head or ek hi tail hota h toh unko class je 
     public static Node head;
     public static Node tail;
     
     public void addfirst(int data){
         //step 1 - create new Node
         Node newNode = new Node(data);
         if(head == null) {
             head = tail = newnode;
             return;
         }
         //step 2 - newnode next = head
         newnode.next = head; //linking Node
         
         //step 3 - head = new Node
         head = newNode
         
     }
     
     
	public static void main(String[] args) {
	    Main ll = new Main();
	    ll.addfirst(1);
	    ll.addfirst(2);
}
	
