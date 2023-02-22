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
	    ll.addmiddle(2,9);
	    ll.print();
    }   
    
}
