/*Andrea Cordón, 16076
Daniel Rodriguez, 15796
Fecha: 5 de abril de 2017
PriorityQueue.java*/

public interface PriorityQueue<E extends Comparable<E>>
{
	public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue

	public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue

	public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue

	public boolean isEmpty();
	// post: returns true iff no elements are in queue

	public int size();
	// post: returns number of elements within queue

	public void clear();
	// post: removes all elements from queue
}
