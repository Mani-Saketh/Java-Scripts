import java.util.Scanner;
public class arrout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
	    int n;
	    n = scan.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Entered size of array is: "+n);
	    System.out.println("Enter the elements into the  array");
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = scan.nextInt();
	    }
	    System.out.println("When tried to print array element of index "+(n+1)+", it shows");
	    try
	    {
	    		System.out.println(arr[n+1]);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("Array Index is out of bounds");
	    }
	}

}
