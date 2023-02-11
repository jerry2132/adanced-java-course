package methodOveloading;

public class factorial {

	int calculateFactorial(int n)
	{
		if(n==1)
		{
			return 1;
			
		}
		else
		{
			return (n* calculateFactorial(n-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
factorial v = new factorial();
factorial n = new factorial();

System.out.println("fatorial of the number is =  "+v.calculateFactorial(6));
	}

}
