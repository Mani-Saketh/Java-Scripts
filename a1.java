import java.util.Scanner;
public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of both the arrays : ");
		n = scan.nextInt();
		int ar1[] = new int[n];
		int ar2[] = new int[n];
		System.out.println("Enter elements of array 1 : ");
		for(int i=0;i<n;i++)
		{
			ar1[i] = scan.nextInt();
			ar2[i] = ar1[i];
		}
		System.out.println("Elements of array 1 : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar1[i]);
		}
		System.out.println("Elements of array 2 : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar2[i]);
		}
		
	}

}
