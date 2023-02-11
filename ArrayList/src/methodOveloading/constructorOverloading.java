package methodOveloading;

public class constructorOverloading {
int id;
String name;
	constructorOverloading()
	{
		System.out.println("default constructor is called ");
		
	}
	constructorOverloading(int i, String s)
	{
		id=i;
		name = s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorOverloading m =new constructorOverloading();
		constructorOverloading b =new constructorOverloading(1,"Sumit");
	System.out.println("student id  =  "+b.id+"   student name  "+b.name);
	}

}
