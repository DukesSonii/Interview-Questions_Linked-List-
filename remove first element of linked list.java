//this code only contains function, to see how to create class Node see previous code of linked list in same folder. ThankYou


public int removeFirst(){ 		//ye line method h 
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){		//mtlb head bh same h or tail bh same h 
            int val = head.data;
            head= tail = null;
            size = 0;
            return val;
        }
        int val = head.data; //val= jis value ko delete krna h
        head = head.next;
        size--;
        return val;
    }	
