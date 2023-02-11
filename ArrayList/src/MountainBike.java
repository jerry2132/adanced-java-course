
public class MountainBike extends Bicycle {
public int seatHeight;

public MountainBike(int startHeight ,int startSpeed , int startGear)
{
	super (startSpeed ,startGear);
seatHeight=startHeight;
}

public void setHeight(int newValue)
{
	seatHeight = newValue;
}


	public static void main(String[] args) {

		// TODO Auto-generated method stub
  MountainBike v = new MountainBike(20,30,10);
  System.out.println("GEAR IS  =  "+v.gear);
  System.out.println("SEAT HEIGHT IS    =  "+v.seatHeight);
  System.out.println("BIKE SPEED IS   =  "+v.speed);
//v.applyBreak(5);
System.out.println("BIKE SPEED AFTER APPLYING BREAK =  "+v.applyBreak(5));

//v.speedUp(10);
System.out.println("BIKE SPEED AFTER INCREASING SPEED  =  "+v.speedUp(10));

	}

}
