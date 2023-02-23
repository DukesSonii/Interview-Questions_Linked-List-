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
        
       public Node findmiddle(Node head){  //this is klnd of helper function for check palindrome
            Node slow = head; 
            Node fast = head;
            
            while(fast!= null && fast.next != null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;        //slow is my middle 
        }   
        
        
         public boolean checkpalindrome() {
            if(head== null || head.next == null ) {  //0 ele or 1ele
                return true;
            }
    
            // Step 1- to find middle
            Node midNode = findmiddle(head);            
            
            
            //Step 2- reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            
            Node right =  prev; //right halv head
            Node left = head;
           
            
            //step 3- check leaft half and right half
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;   //left ko update kr lia and check for remaining elements
                right = right.next;     //right ko bh update kr lia and check for remaining elements
                
            }
            return true;        //ll is paliindrome
        }
        public static void main(String[] args) {
	    Main ll = new Main();
	    ll.addlast(1);
	    ll.addlast(2);
	    ll.addlast(1);
	    ll.print();    //1->2->3->4
	    System.out.println(ll.checkpalindrome());
		}
    
}	
