import java.util.ArrayList;
import java.util.List; 
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> arraylist = new ArrayList<Integer>(4);

for(int i=1;i<5;i++)
arraylist.add(i);

System.out.println(arraylist);

arraylist.remove(2);
System.out.println(arraylist);
arraylist.add(8);
arraylist.add(10);
for(int j : arraylist)
{
System.out.print(j+"  ");
	}

}
}