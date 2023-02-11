package hackerrank;

import java.util.*;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "i i am am rahul rahul"; 
		
		System.out.println(input);
		
		String[] inputArr = input.split(" ");
		
		for(int i=0;i<inputArr.length;i++)
		{
			System.out.println(inputArr);
		}
		Set <String> mySet = new LinkedHashSet <String>();
		
		for(String x: inputArr)
		{
			mySet.add(x);
		}
		System.out.println(mySet);
		
		Iterator itr = mySet.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
			
		}
		
	}

}
