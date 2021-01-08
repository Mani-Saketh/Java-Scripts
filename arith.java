import java.util.Scanner;
public class arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a = scan.nextInt();
		try
		{
			c = a/b;
			System.out.println("C value is : " +c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("We can't divide any number by zero");
		}
	}

}
