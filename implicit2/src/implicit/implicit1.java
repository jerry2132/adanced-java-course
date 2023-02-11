package implicit;

public class implicit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 20;
double v = 50.90;
System.out.println("integer representatiion "+n);
long b = n;
System.out.println("lomg representation  "+b);
float c = b;
System.out.println("float representation  "+c);

//explicit casting 
System.out.println();
System.out.println();

System.out.println("double representation  "+v);
c = (float)v;
System.out.println("new float representation  "+c);
b = (long)v;
System.out.println("new long  representation  "+b);
char o = (char)v;
System.out.println("char representation  "+0);
	}

}
