package coreJavaComaprable;

class Student implements Comparable <Student>
{
	private int rollNo;
	private String name;
	private int age;
	public Student (int rollNo , String name , int age)
	{
		this.rollNo = rollNo;
		this.name =  name ;
		this.age = age;
		
	}
	public void setName (String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
		
	}
	public void setRollno(int rollNo)
	{
		this.rollNo = rollNo;
		
	}
	public int getRollno()
	{
		return rollNo;
		
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
public int compareTo(Student st)
{
	return this.rollNo - st.rollNo;
}
}


