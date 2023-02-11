package queue;
import java.util.*;
public class queueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque <Integer> adq = new ArrayDeque<>();
		 adq.add(87);
		 adq.add(879);
		 adq.add(54);
		 adq.addFirst(6);
		 adq.addLast(8);
		 System.out.println(adq);
		 System.out.println(adq.peek());
		 System.out.println(adq.peekLast());
	System.out.println(adq.pollLast());
	System.out.println(adq.pollFirst());
	System.out.println(adq);
	}

}
