/*
/*Palnidrome Problem: Queue
/*@version 3/2/2017
/*@author Christina Knyaz
*/

public class Queue<E> {
	
	private Node<E> front;
	private Node<E> back;
        private int size;

	public Queue() {
		this.front = null;
		this.back  = null;
	}
	
	
	/*
	 * places element in the back of the Queue
	 */
	public void enqueue(E element){
		
		if (front == null) {
                    back = new Node<E>(element);
                    front = back.next;
                }
                else {
                    back.next = new Node<E>(element);
                    back = back.next;
                }
                size++;
	}
	
	/*
	 * remove the front node of the queue and return it
	 */
	public E dequeue(){
		E element = peek();
                if(element == null) { 
                    return null;
        }
                    front = front.next;
                    size--;
                    return element;
	}
        
	
	/*
	 * Look at the front of the queue and return it, without removing
	 */
	public E peek(){
            if(size == 0) {
		return null;
            }
            else {
                return front.item;
            }
	}
	
	//returns the size of the queue
	public int size(){
		return size;
	}

    boolean isEmpty() {
        return front == back;
    }

}