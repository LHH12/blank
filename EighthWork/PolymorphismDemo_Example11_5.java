
public class PolymorphismDemo_Example11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayObject(new Circle_Example11_2(1,"red",false));
		displayObject(new Rectangle_Example11_3(1, 1, "black", true));
		}
	
	public static void displayObject(GeometricObject_Example11_1 object) {
		System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
		
	}

}
