
public class Bicycle {
protected int gear,speed;
public Bicycle(int startSpeed , int startGear)
{
	gear = startGear;
	speed = startSpeed;
	
}
public void setGear(int newValue)
{
gear = newValue;

}
public int applyBreak(int decreement)
{
	return speed -= decreement;
}
public int  speedUp(int increement)
{
	return speed += increement;
	
}

}

