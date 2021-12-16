
public class TestCircleWithStaticMembers_Example9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + Circle_Example9_6.numberOfObjects);
		
		//Creat c1
		Circle_Example9_6 c1 = new Circle_Example9_6();//Use the Circle_Example9_6 class in Listing 9.6
		
		//Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circl_Example9_6 objects (" +  c1.numberOfObjects + ")");
		
		//Creat c2
		Circle_Example9_6 c2 = new Circle_Example9_6(5);
		
		//Modify c1
		c1.radius = 9;
		
		//Display c1 and cc2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle_Example9_6 objects (" + c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ")  and number of Circle_Example9_6 objects (" + c2.numberOfObjects + ")");
	}

}
