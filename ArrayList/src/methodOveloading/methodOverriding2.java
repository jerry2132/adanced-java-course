package methodOveloading;

public class methodOverriding2 extends methodOveriding{

	public int multiply1(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodOveriding n = new methodOveriding();
System.out.println("multiplication of  two numbers   is   "+n.multiply1(8,9));
methodOveriding x =  new methodOverriding2();
System.out.println("addition of two numbers is   "+x.multiply1(8,9));
	}

}
