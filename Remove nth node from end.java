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
  
    //REMOVE nth Node from End code starts here
        public void deletennodefromend(int n){  //amazon flipkart question
            //calc size
            int sz = 0;
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
                sz++;
            }
            
			//why n last se n mtlb shuru se head 
            if(n == sz){        //head ko delete krna ho toh
                head = head.next;   //head ko next kra dia or phir delete krdo head ko
				return;
            }
            
            //sz-n tak poch na h
            int i =1 ;
            int iTofind = sz-n;	//here itf = prev 
            Node prev = head;       //prev ki value badti jayagi jab tak mera i iTofind(prev) tak nh poch jata 
            while(i<iTofind){   //sz-n is prev 
                prev = prev.next;
                i++;
            }
            
            prev.next=prev.next.next;
            return;
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
	    ll.addlast(4);
	    ll.addlast(5);
	    ll.addmiddle(2,3);
	    ll.print();
	    
	    ll.deletennodefromend(4);
	    ll.print();
    }   
    
}		
