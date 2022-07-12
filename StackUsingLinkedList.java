
/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class Stack {

    //Define the data members
	int i;
    private Node head;
   

    public Stack() {
        //Implement the Constructor
       this.head=null;
       this.i=0;
       
        
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return this.i;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
         
        return this.i==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode=new Node(element);
        if(this.head==null){
            this.head=newNode;
        }
        else{
            newNode.next=this.head;
            this.head=newNode;
        }
        
        ++this.i;
        
        
    }

    public int pop() {
        //Implement the pop() function
        if(this.head==null){
            return -1;
        }
        int ans = this.head.data;
        this.head=this.head.next;
        --this.i;
        return ans;
        
    }

    public int top() {
        //Implement the top() function
        if(this.head==null){
            return -1;
        }
        return this.head.data;
    }
}