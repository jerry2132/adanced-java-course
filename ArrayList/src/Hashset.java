import java.util.HashSet;

public class Hashset {

public static void main(String[] args) {
HashSet<String> hashset = new HashSet<>(5);
hashset.add("june");
//boolean r1 = hashset.add("june");
//System.out.println(r1);
hashset.add("july");
//boolean r2 = hashset.add("july");
//System.out.println(r2);

hashset.add("august");

hashset.add("july");
hashset.add("june");
//Shashset.add(1,"monday");
System.out.println(hashset);
 
System.out.println(hashset.contains("jue"));
hashset.remove("july");
System.out.println(hashset);
}

}
