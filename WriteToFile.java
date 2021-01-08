import java.io.*;

public class WriteToFile {

	public static void main(String[] args) {
		
		try 
		{
			FileWriter myobj = new FileWriter("C:\\Users\\ch.v.s.s.mani saketh\\eclipse-workspace\\ManiSaketh\\HashTable1.txt");
			
			myobj.write("Pradyumna\t1122448822\nPaddu\t8888888888\nSuri\t9090678822\nSai\t9976448811");
			
			myobj.close();
			
			System.out.println("Data was written to the file");
		}
		
		catch (IOException e)
		{
			System.out.println("An error occurred");
		}
		
	}

}