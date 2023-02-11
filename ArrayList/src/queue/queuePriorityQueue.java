package queue;
import java.util.*;

public class queuePriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.add(98);
		pq.add(87);
		pq.add(76);
		pq.offer(876);
		pq.add(9);
		System.out.println(pq);
		pq.poll();
	}

}
