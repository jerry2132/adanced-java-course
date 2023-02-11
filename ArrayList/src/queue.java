import java.util.*;
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue <String > q = new PriorityQueue<>();
q.add("india");
q.add("australia");
q.add("germany");
q.add("england");
q.add("zoo");
q.add("america");
System.out.println("original queue =  "+q);
System.out.println("removed item  =  "+q.remove())	;
System.out.println(q);
System.out.println("element at top of the queue is  = "+q.peek());


	}

}
