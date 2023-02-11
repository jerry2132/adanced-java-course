package claculator;
import java.util.Scanner;
public class ReadInput {

	public static String read()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("INPUT EXPRESSION   ==  ");
		String InputLine = scanner.nextLine();
		scanner.close();
		return InputLine;
				
	}

	}


