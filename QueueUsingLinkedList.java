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

public class Queue {
	
	//Define the data members
	private Node head;
    private Node tail;
    private int size;

	public Queue() {
		//Implement the Constructor
        this.head=null;
        this.tail=null;
        this.size=0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return this.size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return this.size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        Node newNode = new Node(data);
        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
        }
        else{
            this.tail.next=newNode;
            this.tail=this.tail.next;
        }
        ++this.size;
    }


    public int dequeue() {
    	//Implement the dequeue() function
        if(this.isEmpty()){
            return -1;
		}
        int ans=this.head.data;
        this.head=this.head.next;
        --this.size;
        return ans;
    }


    public int front() {
    	//Implement the front() function
        if(this.isEmpty()){
            return -1;
        }
        return this.head.data;
    }
}
