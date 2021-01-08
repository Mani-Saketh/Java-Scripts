import java.util.*;
public class lab1A {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter sequence of integers by keeping space between them and press enter : ");
		String number=scan.nextLine();
		StringTokenizer token1=new StringTokenizer(number);
		int num=0,sum=0;
		System.out.println("\nEntered integers are : ");
		while(token1.hasMoreTokens())
		{
		      String s=token1.nextToken();
		      num=Integer.parseInt(s);
		      System.out.print(num+" ");
		      sum+=num;
		 }
		 System.out.println();
		 System.out.println("Sum is : "+sum);

	}

}