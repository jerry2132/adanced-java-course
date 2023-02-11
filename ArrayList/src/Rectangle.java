
public class Rectangle extends graphicObject {

	void draw()
	{
		System.out.println("Drawing a rectangle");
	}
	void resize()
	{
		System.out.println("Resizing a rectangle ");
	}
	public static void main(String[] args) {
		graphicObject c = new Circle();
		c.draw();
		c.resize();
		System.out.println();
		graphicObject d = new Rectangle();
		
		d.draw();
		d.resize();
		d.moveTo(9, 67);
		
	}
}
