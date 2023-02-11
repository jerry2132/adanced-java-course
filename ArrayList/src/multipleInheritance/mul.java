package multipleInheritance;

public class mul extends Add implements output,football
{
	int x,y;
public int add(int newX,int newY)
{
	x=newX;
	y=newY;
	return x+y;
}
public int sub (int newX,int newY)
{
	x=newX;
	y=newY;
	return x-y;
}
public void add1()
{
	System.out.println("addition  =  ");
}
public void sub1()
{
	System.out.println("substration    =  ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
mul m = new mul();
m.getadd();
m.add1();
System.out.println("  "+m.add(9,8));
System.out.println();

m.getsub();
m.sub1();
System.out.print("  "+m.sub(8,2));

	}

}
