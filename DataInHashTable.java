import java.io.*;
import java.util.*;

public class DataInHashTable {

	public static void main(String[] args) {
		
		 DataInHashTable hashTab = new DataInHashTable();
		 
		 Scanner scan = new Scanner(System.in);
		 
		 Hashtable<String, String>hashData = hashTab.readFromFile("HashTable1.txt");
		 
		 System.out.println("File data into Hashtable:\n"+hashData);
		 
		 System.out.println("Enter the name or mobile number:\n");
		 String str = scan.nextLine();
		 
		 hashTab.printTheData(hashData, str);
    }
	
	private void printTheData(Hashtable<String, String>hashData, String input)
    {
		String output = null;
		if(hashData != null)
		{
			Set<String> keys = hashData.keySet();
			if(keys.contains(input))
			{
				output = hashData.get(input);
			}
			else
			{
				Iterator<String> iterator = keys.iterator();
			    while(iterator.hasNext())
			    {
			    	String key = iterator.next();
				    String value = hashData.get(key);
			        if(value.equals(input))
			        {
			        	output = key;
						break;
			        } 
			    } 
			} 
		}
		
		System.out.println("Input given:"+input);
		if(output != null)
	    {
			System.out.println("Data found in HashTable:"+output);
		}
		else 
		{
			System.out.println("Data not found in HashTable");
		} 
    }
	private Hashtable<String, String>readFromFile(String fileName)
	{
		Hashtable<String, String> hashData = new Hashtable<String, String>();
		try 
		{
			File f = new File("C:\\\\Users\\\\ch.v.s.s.mani saketh\\\\eclipse-workspace\\\\ManiSaketh\\\\"+fileName);
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = null;
			while((line = br.readLine()) != null) 
			{
				String[] details = line.split("\t");
			    hashData.put(details[0], details[1]);
			}
	     } 
		 catch (FileNotFoundException e) 
		 {
			 e.printStackTrace();
	     } 
		 catch (IOException e)
		 {
			 e.printStackTrace();
		 }
		 return hashData; 
	} 

}