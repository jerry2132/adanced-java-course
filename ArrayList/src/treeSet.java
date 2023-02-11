import java.util.TreeSet;
public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> tree = new TreeSet<>();
tree.add("sumit");
tree.add("sumit1");
tree.add("sumit2");
tree.add("kuku");
tree.add("kuku0");
System.out.println(tree);
tree.remove("kuku");
System.out.println(tree);

	}

}
