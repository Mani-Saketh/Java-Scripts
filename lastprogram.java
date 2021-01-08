import java.util.Scanner;
public class lastprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int num;
	       Scanner scan = new Scanner(System.in);
	       System.out.println("Enter Number That you want find factorial Value : ");
	       num = scan.nextInt();
	        long factorial = 1;
	        for(int i = 1; i <= num; ++i)
	        {
	            factorial *= i;
	        }
	        System.out.printf("Factorial of %d = %d\n", num, factorial);
	}

}
