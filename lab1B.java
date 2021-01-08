import java.util.Scanner;
public class lab1B {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements into the array: ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int max =  arr[0];
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])
            {
                max = arr[i];
            }
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Largest Number in Array is: "+max);
        System.out.println("Smallest Number in Array is: "+min);
	}

}
