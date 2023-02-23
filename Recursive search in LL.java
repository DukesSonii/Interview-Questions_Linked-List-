//this code only contains function, to see how to create class Node see previous code of linked list in same folder. ThankYou

public int helper(Node head, int key){
            if(head == null){
                return -1;
            }
			
			      if(idx == -1){	//agar nh dhund pata h toh -1
                return -1;
            }
			
            if(head.data == key){
                return 0;
            }
            int idx = helper(head.next, key);	//helper head ka next i.e baaki ki linked list mai dhund pata h key ko
            
            return idx+1;	//dhund lia toh idx+1 kyu ki iss level ko pata h ki upar wala level na jo bh 
			//head.next ne jo bh idx return kr ke dia h woh sahi nh h kyu ki original head toh 
			//mai tha isliye mujhe 1 ko add krna h   
            
        }
        
        public int recsearch(int key){
            return helper(head, key);
        }    

