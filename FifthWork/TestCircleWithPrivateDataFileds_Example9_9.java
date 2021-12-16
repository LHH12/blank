
public class TestCircleWithPrivateDataFileds_Example9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a circle with radius 5.0
		CIrcle_Example9_8 myCircle = new CIrcle_Example9_8(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		//Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects is " + CIrcle_Example9_8.getNumberOfObjects());
	}

}
