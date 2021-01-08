import java.io.*;
import java.util.Scanner;
class Station
{
    void customer() throws IOException
    {
        try
        {
            File fil=new File("customer.txt");
            if(!fil.exists())
            {
                fil.createNewFile();
            }
            BufferedWriter output=new BufferedWriter(new FileWriter("customer.txt",true));
            System.out.print("\nChoose The Product To Complaint ");
            System.out.print("\n1.LAPTOPS ");
            System.out.print("\n2.SMART PHONES ");
            System.out.print("\n3.TV'S ");
            System.out.print("\n4.OTHER ELECTRONIC DEVICES \n");
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            if(a==1 || a==2 || a==3 || a==4)
            {
                System.out.print("\nEnter your details,your details will be sent to our executive");
            }
            else
            {
                System.out.print("\nPlease Select Anything from given options");
                customer();
            }
            String Name,Fathername,complaint;
            System.out.print("\nenter your first name:");
            Scanner scan=new Scanner(System.in);
            Name=scan.nextLine();
            System.out.print("\nenter your father's first name:");
            Fathername=scan.nextLine();
            System.out.print("\nenter the city you stay: ");
            String city, mail;
            city=scan.nextLine();
            System.out.println("Enter E-mail ID : ");
            mail=scan.nextLine();
            System.out.print("\nExplain your issue: ");
            complaint=scan.nextLine();
            output.write(Name+"\t");
            output.write(Fathername+"\t");
            output.write(city+"\t");
            output.write(mail+"\t");
            output.write(complaint);
            output.newLine();
            output.close();
            System.out.print("The name of the person is: "+Name);
            System.out.print("\nFather's name is: "+Fathername);
            System.out.print("\ncity you stay in:"+city);
            System.out.print("\nThe complaint registered successfully and it is: "+complaint);
            System.out.println("\nOur Executive will contact you soon....Please wait");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("error");
        }
    }
    void Applicants() throws IOException
    {
        try
        {
            File fil=new File("Applicants.txt");
            if(!fil.exists())
            {
                fil.createNewFile();
            }
            BufferedWriter output=new BufferedWriter(new FileWriter("Applicants.txt",true));
            System.out.print("\nIn which sector you want to Work : ");
            System.out.print("\n1.LAPTOPS Repairs");
            System.out.print("\n2.SMART PHONES Repairs");
            System.out.print("\n3.TV Repairs");
            System.out.print("\n4.OTHER ELECTRONIC DEVICES Repairs\n");
            Scanner s=new Scanner(System.in);
            int b=s.nextInt();
            if(b==1 || b==2 || b==3 || b==4)
            {
                System.out.print("\nenter your details,your details will be sent to our recruitment team");
            }
            else
            {
                System.out.print("\nPlease Select Anything from given options");
                Applicants();
            }
            String Name,Fathername,Gender,year, dob, qualification, mail;
            System.out.print("\nEnter your name:");
            Scanner scan=new Scanner(System.in);
            Name=scan.nextLine();
            System.out.print("\nEnter your father's name:");
            Fathername=scan.nextLine();
            System.out.print("\nEnter the city you stay: ");
            String city;
            city=scan.nextLine();
            System.out.print("\nEnter your Gender: ");
            Gender=scan.nextLine();
            System.out.print("\nEnter your DOB(DDMMYYYY): ");
            dob=scan.nextLine();
            System.out.print("\nEnter your Qualification: ");
            qualification=scan.nextLine();
            System.out.println("Enter E-mail ID : ");
            mail=scan.nextLine();
            System.out.print("\nEnter your no. of Experience years: ");
            year=scan.nextLine();
            output.write(Name+"\t");
            output.write(Fathername+"\t");
            output.write(city+"\t");
            output.write(Gender+"\t");
            output.write(dob+"\t");
            output.write(qualification+"\t");
            output.write(mail+"\t");
            output.write(year+"\t");
            output.write(b+"\t");
            output.newLine();
            output.close();
            System.out.println("\nOur team will contact you soon if your resume is selected....Please wait");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("error");
        }
    }
    void admin()
    {
        System.out.println("\n[1]Check Complaints\n[2]Check Applicants\n");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        if(choice==1)
        {
            try (BufferedReader br = new BufferedReader(new FileReader("customer.txt")))
            {
                System.out.print("Name\tFatherName\tCity\tMailID\tComplaint\n");
                String strCurrentLine;
                while ((strCurrentLine = br.readLine()) != null)
                {
                    System.out.println(strCurrentLine);
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        else if(choice==2)
        {
            try (BufferedReader br = new BufferedReader(new FileReader("Applicants.txt")))
            {
                System.out.print("Name\tFatherName\tCity\tGender\tDOB\tQualification\tMail\tExperience Interested Sector\n");
                String strCurrentLine;
                while ((strCurrentLine = br.readLine()) != null)
                {
                    System.out.println(strCurrentLine);
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        else
        {
            admin();
        }
    }
    void disp()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("\nPlease enter as anyone one of the following:"); 
        System.out.print("\n[1]Customer");
        System.out.print("\n[2]Job Applicant");
        System.out.print("\n[3]Admin");
    }
}

public class Main1
{
    public static void main(String args[])throws Exception
    {
        int i;
        String user1, PASSWORD;
        System.out.print("\nWELCOME TO COMPLAINT MANAGEMENT DEPARTMENT");
        Scanner scan = new Scanner(System.in);
        Station O=new Station();
        O.disp();
        Scanner s=new Scanner(System.in);
        System.out.print("\nENTER YOUR CHOICE:");
        i=s.nextInt();
        switch(i)
        {
            case 1: O.customer();
                    break;
            case 2: O.Applicants();
                    break;                    
            case 3: 
                    System.out.println("Enter USER NAME : ");
                    user1 = scan.nextLine();
                    System.out.println("Enter PASSWORD : ");
                    PASSWORD = scan.nextLine();
                    if("group20".equals(user1) && "group20".equals(PASSWORD)) //Username And PASSWORD is group20.
                    {
                        O.admin();
                        break;
                    }
                    else
                    {
                        System.out.println("Incorrect PASSWORD or Username");
                        O.disp();
                        break;
                    }
        }
    }
}