
public class TestCircle_Example9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle();
		System.out.println("The area of the circle of radius" + circle1.radius + " is " + circle1.getArea());
		
		Circle circle2 = new Circle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		
		Circle circle3 = new Circle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
		
		circle2.radius = 100;//or circle2.setRadius(100)
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}

}

//Define the circle class with two contructors
class Circle
{
	double radius;
	
	Circle()
	{
		radius = 1;
	}
	
	/**Construct a circle with a specified radius */
	Circle(double newRadius)
	{
		radius = newRadius;
	}
	/**Return the area of this circle */
	double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	/** Return the perimeter of this circle */
	double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	
	/** Set a new radius for this circle */
	void setRadius(double newRadius)
	{
		radius = newRadius;
	}
}
