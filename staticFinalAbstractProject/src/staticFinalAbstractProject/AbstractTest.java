package staticFinalAbstractProject;

  public class AbstractTest{
	  public static void main(String[] args) {
		GeometricalShape shape = new Square(30);
	}
  }

abstract class GeometricalShape
{
	abstract void calcArea();
	abstract void calcPerimeter();
	void fillColour() {
		System.out.println("Filling Colour........");
	}
}

class Square extends GeometricalShape{
	int side;
	
	
	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}


	public Square(int side) {
		super();
		this.side = side;
	}
	

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calcPerimeter() {
		// TODO Auto-generated method stub
		
	}

}

class Rectangle extends Square{
	int breadth;

	public Rectangle(int side, int breadth) {
		super(side);
		this.breadth = breadth;
	}
	
//	void calcArea() {  //NOTMENDETORY
//		float area = getSide() * breadth;
//		System.out.println("Rectangle area : "+area);
//	}
//	void calcPerimeter() { //NOTMENDETORY
//		float perimeter = 2*(getSide() + breadth);
//		System.out.println("Perimeter of Rectangle : "+perimeter);
	}
