import java.util.Scanner;
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a : ");
		a = scan.nextInt(); 
		System.out.println("Enter b : ");
		b = scan.nextInt();
		System.out.println("Enter c : ");
		c = scan.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is maximum and it's value is "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is maximum and it's value is "+b);
		}
		else
		{
			System.out.println("c is maximum and it's value is "+c);
		}
	}

}
