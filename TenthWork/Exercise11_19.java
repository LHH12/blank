import java.util.Scanner;
import java.util.ArrayList;
public class Exercise11_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Container> containers = new ArrayList<>();
		containers.add(new Container());
		System.out.print("Enter the number of the objectd: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.print("Enter the weight of the objects: ");
		for(int i = 0; i < num; i++)
		{
			double tmp = input.nextDouble();
			boolean in = false;
			for(Container now : containers)
			{
				if(now.weightLeft >= tmp)
				{
					now.asses.add(tmp);
					now.weightLeft -= tmp;
					in = true;
					break;
				}
			}
			if(in)
			{
				Container jj = new Container();
				jj.weightLeft -= tmp;
				jj.asses.add(tmp);
				containers.add(jj);
			}
		}
		int index = 1;
		for(Container jojo : containers)
		{
			System.out.print("Container " + index + " containers objects with weight ");
			index++;
			for(double jj : jojo.asses)
				System.out.print(jj + " ");
			System.out.print('\n');
		}
	}

}

class Container
{
	public double weightLeft = 10;
	public ArrayList<Double> asses;
	public Container() {
		asses = new ArrayList<>();
	}
}
