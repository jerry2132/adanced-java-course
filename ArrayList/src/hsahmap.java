import java.util.*;
import java.util.Map.*;
public class hsahmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map = new HashMap<>();
map.put(4," sumit");
map.put(2,"  kuku");
map.put(3,"  ashish");
map.put(1, " peter");
System.out.println("map size  =    "+ map.size());
System.out.println(map);

String a = map.get(1);
System.out.println("value for key 1 is  "+a );
System.out.println("value for key 2 is   "+map.get(2));
	
for(Integer key : map.keySet()) {
	System.out.println("key  "+key+"   value  "+map.get(key));
}
	//or
	System.out.println();
	System.out.println();
	for(Entry<Integer, String> entry : map.entrySet()) {
	System.out.println("key  "+entry.getKey()+"  value  "+entry.getValue());
	
	
	}

	}

}
