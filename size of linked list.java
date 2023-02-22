public class Main // or public class linked list
{
    public static class Node{
			//----------copy from previous codes-----------
        
    }    
     public static Node head;
     public static Node tail;
     public static int size;
     
      public void addlast(int data){
         //step 1 - create new Node
         Node newNode = new Node(data);
         size++;
          = newNode;
        }
     
     public void addmiddle(int idx, int data){
         
         if(idx == 0){
             addlast(data);
             return;
         }
         Node newNode = new Node(data);
         size++;
                 
    } 
	public static void main(String[] args) {
	    Main ll = new Main();
	     ll.addlast(2);
	    ll.addlast(1);
	    ll.addlast(3);
	    ll.addlast(4);
	    ll.addmiddle(0,9);
	    ll.print();
	    System.out.println(ll.size);
    }   
    
}	
