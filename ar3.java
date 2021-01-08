import java.util.Scanner;
public class ar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
	    int n;
	    n = scan.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Enter the elements into the  array");
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = scan.nextInt();
	    }
	    int prod = 0;
	    int temp = 0;
	    int rem;
	    for(int i=0;i<n;i++){
	         temp = arr[i];
	         while(temp!=0){
	             rem =  temp%10;
	             prod = prod + (rem*rem*rem);
	             temp = temp/10;
	         }
	         if(prod == arr[i]){
	             System.out.println("The armstrong numbers in the array are: "+arr[i]);
	         }
	    }
	}

}
