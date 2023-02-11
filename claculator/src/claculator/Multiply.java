package claculator;


	public class Multiply implements Operate {

		public Double getResult(Double...numbers)
		{
			Double mul = numbers[0];
			for(int i=1;i<numbers.length;i++)
			{
				mul*=numbers[i];
				
			}
		return mul;
		}
		
		
	}

