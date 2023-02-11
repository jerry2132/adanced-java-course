
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {

	private int customerNumber;
	private  int pinNumber ;
	private double checkingBalance = 0;
	private double savingBalance= 0;
	
	Scanner  input = new Scanner (System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
		return customerNumber;
	
	}
	
	public int getCustomerNumber()
	{
		return customerNumber;
	}
public int setPinNumber(int pinNumber)
{
	this.pinNumber = pinNumber;
	return pinNumber;
}

public int getPinNumber()
{
	return pinNumber;
}

public double getCheckingBalance ()
{
	return checkingBalance;

		}
public double getSavingBalance ()
{
	return savingBalance; 
}
public double calcCheckingWithdraw(double amount)
{
	checkingBalance = (checkingBalance - amount);
	return checkingBalance;
}

public double calcSavingWithdraw(double amount)
{
	savingBalance = (savingBalance - amount);
	return savingBalance ;
}
public double calcCheckingDeposit(double amount)
{
	checkingBalance = (checkingBalance + amount);
	return checkingBalance;
}
public double calcSavingDeposit(double amount)
{
	savingBalance = (savingBalance +  amount);
	return savingBalance;
}

public void getCheckingWithdrawInput()
{
	System.out.println("CHECKING ACCOUNT BALANCE  :  "+moneyFormat.format(checkingBalance));
	System.out.println("AMOUNT YOU WANT TO WITHDRAW FROM CHECKIN ACCOUNT :  ");
	double amount = input.nextDouble();
	
	if((checkingBalance - amount)>=0)
	{
		calcCheckingWithdraw(amount);
		System.out.println("NEW CHECKING ACCOUNT BALANCE :  "+moneyFormat.format(checkingBalance));
	}
	else {
		System.out.println("BALANCE CANNOT BE NEGATIVE   ");
		
	}
	
}

public void getSavingWithdrawInput()
{
	System.out.println("SAVING ACCOUNT BALANCE  :  "+moneyFormat.format(savingBalance));
	System.out.print("AMOUNT YOU WANT TO WITHDRAW FROM SAVING ACCOUNT  :  ");
	double amount = input.nextDouble();
	
	if((savingBalance - amount) >=0) {
		calcSavingWithdraw(amount);
		System.out.println("NEW SAVING ACCOUNT BALANCE :  "+moneyFormat.format(savingBalance));
		System.out.println();
	}
	else 
	{
		System.out.println("BALANCE CANNOT BE NEGATIVE  :  ");
		System.out.println();
	}
}

public void getCheckingDepositInput()
{
	System.out.println("CHECKING ACCOUNT BALANCE  :  "+moneyFormat.format(checkingBalance));
	System.out.println("AMOUNT YOU WANT TO DEPOSIT FROM CHECKING ACCOUNT  :  ");
	double amount = input.nextDouble();
	
	if ((checkingBalance + amount) >= 0 )
	{
		calcCheckingDeposit(amount);
		System.out.println("NEW CHECKING ACCOUNT BALANCE  :  "+moneyFormat.format(checkingBalance));
		
	}
	else 
	{
		System.out.println("BALANCE CANNOT BE NEGATIVE  ...  ");
		
	}
}

public void getSavingDepositInput()
{
	System.out.println("SAVING ACCOUNT BALANCE  :  "+moneyFormat.format(savingBalance));
	System.out.println("AMOUNT YOU WANT TO DEPOSIT TO SAVINGS ACCOUNT  :  ");
	double amount = input.nextDouble();
	
	if ((savingBalance +amount) >= 0)
	{
		calcSavingDeposit(amount);
		System.out.println("NEW SAVING ACCOUNT BALANCE  :  "+moneyFormat.format(amount));
	}
	else 
	{
		System.out.println("BALANCE CANNOT BE NEGATIVE  ... ");
  		
	}
}


}

