/** ����CIrcleWithPrivateDataFileds_Example9_9 */
public class CIrcle_Example9_8 {
	/** The radius of the circle */
	private double radius = 1;
	
	/** The number of objects created */
	private static int numberOfObjects = 0;
	
	/** Construct a circle with radius 1 */
	private static int numbereOfObjects = 0;
	
	/** Construct a circle with radius 1 */
	public CIrcle_Example9_8() {
		numberOfObjects++;
	}
	
	/** Construct a circle with a specified radius */
	public CIrcle_Example9_8(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	/** Return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/** Return the area of this  circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
