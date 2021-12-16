
public class TotalAarea_Example9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare circleArry
		CIrcle_Example9_8[] circleArray;
		
		//Creat circleArray
		circleArray = createCircleArray();
		
		//Print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}
	public static CIrcle_Example9_8[] createCircleArray() {
		CIrcle_Example9_8[] circleArray = new CIrcle_Example9_8[5];
		
		for(int i = 0; i < circleArray.length; i++)
		{
			circleArray[i] = new CIrcle_Example9_8(Math.random() * 100);
		}
		
		//Return CIrcle_Example9_8 arrY
		return circleArray;
	}
	
	/** Print an array of circles and their tital area */
	public static void printCircleArray(CIrcle_Example9_8[] circleArray) {
		System.out.printf("%-35s%-15s\n","Radius", "Area");
		for(int i = 0; i < circleArray.length; i++)
		{
		    System.out.printf("%-30f%15f\n", circleArray[i].getRadius(),circleArray[i].getArea());
		}
		
		System.out.println("________________________");
		
		// Compute and display the result
		System.out.printf("%-30s%-15f\n", "The total area of circles is",sum(circleArray));
	}
	
	/** Add circle areas */
	public static double sum(CIrcle_Example9_8[] circleArray) {
		//Initialize sum
		double sum = 0;
		
		// Add areas to sum
		for(int i = 0; i < circleArray.length; i++)
			sum += circleArray[i].getArea();
			
			return sum;
	}

}
