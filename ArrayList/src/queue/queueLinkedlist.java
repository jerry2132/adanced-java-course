package queue;
import java.util.*;

public class queueLinkedlist
{

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(12);
		q.offer(38);
		q.offer(45);
		q.offer(78);
		
		System.out.println(q);

		System.out.println(q.poll());
		
		System.out.println(q);
		System.out.println(q.peek());
		
	}
	
}