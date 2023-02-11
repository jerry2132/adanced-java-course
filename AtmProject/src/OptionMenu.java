import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class OptionMenu extends Account {
Scanner menuInput = new Scanner (System.in);
DecimalFormat moneyFormat = new DecimalFormat ("'$'");
HashMap <Integer,Integer> data = new HashMap<>();


public void getLogin() throws IOException
{
int x = 1;
do
{
	try 
	{
		data.put(987654,123456);
		data.put(678943,789347);
		data.put(9876, 987);
		 System.out.println("WELCOME TO ATM PROJECT ");
		 System.out.println("ENTER YOUR CUSTOMER NUMBER");
		 setCustomerNumber(menuInput.nextInt());
		 
		 System.out.println("ENTER YOUR PIN NUMBER ");
		 setPinNumber(menuInput.nextInt());
		 
	}
	catch (Exception e)
	{
		System.out.println(" INVALID CHARACTER ...ONLY NUMBERS ALLOWED  ");
		x=2;
		
	}
	int cn = getCustomerNumber();
	int pn = getPinNumber();
	if(data.containsKey(cn) && data.get(cn)==pn)
	{
		getAccountType();
	}
	else 
		System.out.println("WRONG CUATOMER NUMBER OR PIN  ");
	
	}while (x==1);
	
}

public void getAccountType()
{
System.out.println(" SELECT THE ACCOUNT YOU WANT TO ACCESS :  ");
System.out.println("TYPE 1 - CHECKING ACCOUNT  ");
System.out.println("TYPE 2 -  SAVING ACCOUNT ");
System.out.println("TYPE 3 -  EXIT");

int selection = menuInput.nextInt();


switch (selection)
{
case 1 :
	getChecking();
	break;
case 2 :
	getSaving();
	break;
case 3 :
	System.out.println("THANKYOU FOR USING THIS ATM ..  ");
	break;
default :
	System.out.println("INVALID CHOICE ...");
	
	
}
}

public void getChecking()
{
	System.out.println("CHECKING ACCOUNT  ");
	System.out.println("TYPE 1 - VIEW BALANCE ");
	System.out.println("TYPE 2 - WITHDRAW MONEY  ");
	System.out.println("TYPE  3 -  DEPOSIT MONEY  ");
	System.out.println("TYPE 4 - EXIT");
	//System.out.println("CHOISE   ");
	
	int selection = menuInput.nextInt();
 
	switch(selection)
	{
	case 1 :
		System.out.println("CHECKING ACCOUNT BALANCE  :  "+moneyFormat.format(getCheckingBalance()));
	break;
		case 2 :
		getCheckingWithdrawInput();
		getAccountType();
		break;
		case 3 :
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4 :
			System.out.println("THANQ FOR USING ATM SERVICE .. .  ");
			break;
		default:
			System.out.println("INVALID CHOICE  ....  ");
				
			
	}
	
}

public void getSaving() {
	System.out.println("  SAVING ACCOUNT : ");
	System.out.println("TYPE 1 - VIEW BALANCE ");
	System.out.println("TYPE 2 - WITHDRAW MONEY ");
	System.out.println("TYPE 3 - DEPOSIT MONEY ");
	System.out.println("CHOICCE :  ");
	int selection = menuInput.nextInt();

	
 switch (selection)
 {
 case 1 :
	 System.out.println("SAVING ACCOUNT BALANCE :  "+moneyFormat.format(getSavingBalance()));
	 break;
 case 2 :
	 getSavingWithdrawInput();
	 getAccountType();
	 break;
 case 3 :
	 getSavingDepositInput();
	 getAccountType();
	 break;
 case 4 :
	 System.out.println("THANQ FOR USING ATM SERVICE   ... ");
	 break;
 default :
	 System.out.println("INVALID CHOICE  ...  ");
	 getChecking();

	 
 }
	
	
}


 
}
