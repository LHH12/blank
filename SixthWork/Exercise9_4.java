import java.util.Random;
public class Exercise9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(1000);
		for(int i = 0; i < 50; i++)
		{
			System.out.print(r.nextInt(100) + " ");
		}
	}

}
