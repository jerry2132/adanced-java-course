
public abstract class graphicObject {
	int x,y;
	 graphicObject()
	 {
		 System.out.println("abstrat class constructor");
	 }
	void moveTo(int newX,int newY)
	{
		y=newY;
		x=newX;
		System.out.println("move to x  "+x+"  move to Y   "+y);
		
	}
	abstract void draw();
	abstract void resize();
}



