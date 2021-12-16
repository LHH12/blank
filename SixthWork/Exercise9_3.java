import java.util.Date;
public class Exercise9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long second = 10000;
		for(int i = 0; i < 8; i++)
		{
			Date curr = new Date(second);
			System.out.println(curr.toString());
			second *= 10;
		}
	}

}
