
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int month = 99;
String monthstring = null;
switch(month)  {
case 1 :
	monthstring = "january";
	break;
case 2 :
	monthstring = "feb";
	break;
case 3 :
	monthstring  = "mar";
	break;
case 4 : 
	monthstring = "april";
	break;
case 5 :
	monthstring = "may";
	break;
case 6 :
	monthstring = "june";
	break;
case 7 :
	monthstring = "july";
	break;
case 8 :
	monthstring = "aug";
	break;
case 9 :
	monthstring = "sep";
	break;
case 10 :
	monthstring = "oct";
	break;
case 11 :
	monthstring = "november";
	break;
case 12 : 
	monthstring = "dec";
	break;
	default:
		monthstring  = "invalid match";
}
System.out.println(monthstring);
	

// do while loop

int count = 0;
do   {
	System.out.println("value of count  "+count);
	count++;
}
	while(count<=10);

	}

}
