import java.util.Scanner;
public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of array : ");
		n = scan.nextInt();
		int arrr[] = new int[n];
		System.out.println("Enter all the elements : ");
		for(int i=0;i<n; i++)
		{
			arrr[i] = scan.nextInt();
		}
		System.out.println("The negative elements of array are :  ");
		for(int i=0;i<n;i++)
		{
			if(arrr[i]<0)
			{
				System.out.println(arrr[i]);
			}
		}
	}

}
