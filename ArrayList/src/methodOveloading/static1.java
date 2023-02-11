package methodOveloading;

public class static1 {

	static {
	
		System.out.println(" student information ");
	//int count=0;	
	}
	
	String name;
	int age ;
	String address;
	static String college ="THDC IHET";
	static int count = 0;
	
	public static1 (String name ,int age , String address)
	{
		this.name = name ;
		this.age = age;
		this.address=address;
	}
	static void studentCount()
	{
		count = count+1;
	}
	public boolean equals(Object obj)
	{
		if(this ==obj)
			return true;
		else if (obj == null )
		return false;
		
		else if	(obj.getClass()!=this.getClass() )
			return false ;
		
		//return false;
		
   static1 stu = (static1)obj;
	return (stu.age == this.age);
		
		
	}
	public void  getInfo()
	{
		System.out.println("name of the candidate =  "+name);
		System.out.println("age of the candidate  = "+age);
		System.out.println("address of the candidate  =  "+address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
static1 m =new static1("sumit",23,"nandpur");
static1 m1 =new static1("sumit",23,"nandpur");
System.out.println(m.equals(m1));
m.getInfo();
System.out.println();
m1.getInfo();
System.out.println("college name =  "+static1.college);
System.out.println(static1.count);
	}

}
