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
        
       public Node findmiddle(Node head){  //this is klnd of helper function for check palindrome
            Node slow = head; 
            Node fast = head.next;
            
            while(fast!= null && fast.next != null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;        //slow is my middle
        }  
        
        public Node merge(Node head1, Node head2){
            Node mergeLL = new Node(-1);
            Node temp = mergeLL;
            
            while(head1 != null && head2 != null){
                if(head1.data <= head2.data){
                    temp.next = head1;
                    head1 = head1.next; //head ko updat kia
                    temp = temp.next;   //temp ko bh update kia
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }
            
            //bache hue elements ka liye
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next; //head ko updat kia
                temp = temp.next; //temp ko bh
            }
            
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next; //head ko updat kia
                temp = temp.next; //temp ko bh
            }
            
            return mergeLL.next; //temp mai -1 store hua tha initially toh usko hata
        }
        
        public Node mergeSort(Node head){
            if(head == null && head.next == null){
                return head;
            }
            
            //find mid 
            Node mid = findmiddle(head);
            
            //left and right MS
            Node righthead=  mid.next;
            mid.next = null;
            Node newleft = mergeSort(head);			//merge sort for left half
            Node newright = mergeSort(righthead);	//merge sort for right half, righthead right half ke liye head h
													//or usko stre kra dia newleft or newright mai
            //merge
            return merge(newleft, newright); 
            
        }
        public static void main(String[] args) {
	    Main ll = new Main();
	    ll.addfirst(1);
	    ll.addfirst(2);
	    ll.addfirst(3);
	    ll.addfirst(4);
	    ll.addfirst(5);
	    ll.print();    
	    ll.head = ll.mergeSort(ll.head);
	    ll.print();
            
        }
    
}	
