package methodOveloading;

public class overloading
{
/*ublic int overloading(int x,int y)
{
	this.x=x;
	this.y=y;
	return (x+y);
}
public int overloading( int x)
{
	return (x*x);
}*/
	public int multiply(int x , int y)
	{
		return (x*y);
	}
	public int multiply(int x, int y, int z)
	{
		return (x*y*z);
	}
public double multiply(double x, double y)
{
	return x*y;
}
public static void main(String[] args) {
	
	overloading n = new overloading();
	//overloading m = new overloading();
	System.out.println("multiplicaton of two numbers is "+n.multiply(5,7));
	System.out.println("multiplicaton of three  numbers is "+n.multiply(5,7,9));
	System.out.println("multiplicaton of two numbers is "+n.multiply(5,6));
	
}
}

