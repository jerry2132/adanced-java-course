import java.util.*;
public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap< String, Integer> tree = new TreeMap<>();
tree.put("sumit", 25);
tree.put("neymar",76);
tree.put("messi",100);
tree.put("ronaldo", 89); 
System.out.println(tree); 
tree.remove("messi");
System.out.println(tree);
tree.put("modric", 9);
	System.out.println();
for(Map.Entry<String, Integer> e : tree.entrySet())
{
	System.out.println("keys = "+e.getKey()+"  value = "+e.getValue());
	}
}

}
