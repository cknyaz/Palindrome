/*
/*Palnidrome Problem: Stack
/*@version 3/2/2017
/*@author Christina Knyaz
*/

import java.util.EmptyStackException;

/*
 * Implement a reference based stack
 */
public class Stack<E> {
	
	public Node<E> top;
        int size;

	public Stack() {
		this.top =null;
	}
	
	
	/*
	 * places element on the top of the stack
	 */
	public void push(E element){
		
		top = new Node<E>(element);

	}
	
	/*
	 * remove the top node and return its contents
	 */
	public E pop(){
		
            if(top == null) {
                throw new EmptyStackException();
            }
            else {
                E result = top.item;
                top = top.next;
                return result;
            }
	}
	
	/*
	 * Look at the top element of the Stack and return it, without removing
	 */
	public E peek(){
            if(top == null) {
                throw new EmptyStackException();
            }
            else{
            return top.item;  
            }
    }

	//returns the size of the stack
	public int size(){
		return size;  
	}

}