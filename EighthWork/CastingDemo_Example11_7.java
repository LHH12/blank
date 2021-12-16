
public class CastingDemo_Example11_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object1 = new Circle_Example11_2(1);
		Object object2 = new Rectangle_Example11_3(1, 1);
		
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object object) {
		if(object instanceof Circle_Example11_2) {
			System.out.println("The circle area is " + ((Circle_Example11_2)object).getArea());
			System.out.println("The circle diameeter is " + ((Circle_Example11_2)object).getDiameter());
		}
		else if(object instanceof Rectangle_Example11_3) {
			System.out.println("The rectangle area is " + ((Rectangle_Example11_3)object).getArea());
		}
	}

}
