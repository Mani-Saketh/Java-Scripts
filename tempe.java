import java.util.Scanner;
public class tempe
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Enter Celsius Value :  ");
		Scanner scan = new Scanner(System.in);
		double celsi = scan.nextDouble();
		double conver = 1.8d;
		double faren;
		faren = 32 + (celsi)*conver ; 
		System.out.println("The Farenheit value is " +faren);
	}
}

