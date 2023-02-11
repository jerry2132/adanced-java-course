import java.util.LinkedList;
public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList<String> list = new LinkedList<String>();
   list.add("hjdfhg");
   list.add("june");
	System.out.println(list);
	
	list.addLast("december");
	System.out.println(list);
	
	list.add(1,"july");
	System.out.println(list);
	
	list.addFirst("january");
	System.out.println(list);
	
	list.add("kfjhdiduyfig");
	System.out.println(list);
	
	list.remove(1);
	System.out.println(list);
	list.removeLast();
	System.out.println(list);
	}

}
