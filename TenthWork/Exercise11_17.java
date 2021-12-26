import java.util.Scanner;
import java.util.ArrayList;
public class Exercise11_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int oldm = m;
		ArrayList<Integer>divides = new ArrayList<>();
		while(m != 1)
		{
			for(int i = 0; i <= m; i++)
			{
				if(m % i == 0)
				{
					divides.add(i);
					m /= i;
					break;
				}
			}
		}
		int n = 1;
		int sb = 1;
		for(int jj:divides)
		{
			if(occur(divides,jj) % 2 == 1 && jj != sb)
			{
				n *= jj;
				sb = jj;
			}
		}
		System.out.println(n);
		System.out.println(oldm * n);
	}
	
	public static int occur(ArrayList<Integer>l,int k)
	{
		int count = 0;
		for(int j:l)
		{
			if(j == k)
				count++;
		}
		return count;
	}

}
