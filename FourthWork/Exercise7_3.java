import java.util.Scanner;
public class Exercise7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int[] num = new int[101];
        int n;
        System.out.print("Enter the between 1 and 100: ");
        while(true)
        {
        	n = input.nextInt();
        	if(n == 0) break;
        	num[n]++;
        }
        for(int i = 1;i < 101;i++)
        {
        	if(num[i] != 0)
        	{
        		System.out.print(i + " occurs " + num[i] + " time");
        		System.out.println(((num[i] > 1) ? 's' : ""));
        	}
        }
	}

}
