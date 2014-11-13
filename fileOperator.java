import java.util.Scanner;
import java.io.*;

public class fileOperator
{
	public static void main (String [] args)
	{
        multiplier("bigramrankfreq.txt");
        //divider("bigramfreq.txt");

	}
    
    public static void divider(String filename)
    {
        double num;
        //double total = 22411151;
        double bigramTotal = 38521;
        
        try
        {
            
            
            FileInputStream file = new FileInputStream(filename);
            Scanner scan = new Scanner (file);
            File outputFile = new File("divOutput.txt"); //Creates the output file
            
            FileWriter fWriter = new FileWriter(outputFile);
            BufferedWriter buffWriter = new BufferedWriter(fWriter);
            
            
            while(scan.hasNextLine())
            {
                num = scan.nextDouble();
                num = num / bigramTotal;
                
                //Write to file
                
                buffWriter.write(num + "\n");
                
            }
            
            buffWriter.close();
        }
        catch (Exception e)
        {
            System.out.println("error");
        }

    }
    
    public static void logger(String filename)
    {
        double num;
        double total = 22411151;
        double bigramTotal = 38521;
        
        try
        {
            
            
            FileInputStream file = new FileInputStream(filename);
            Scanner scan = new Scanner (file);
            File outputFile = new File("logOutput.txt"); //Creates the output file
            
            FileWriter fWriter = new FileWriter(outputFile);
            BufferedWriter buffWriter = new BufferedWriter(fWriter);
            
            
            while(scan.hasNextLine())
            {
                num = scan.nextDouble();
                num = num / bigramTotal;
                num = Math.log(num);
                
                //Write to file
                
                buffWriter.write(num + "\n");
                
            }
            
            buffWriter.close();
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        
    }
    
    public static void multiplier(String filename)
    {
        double num1, num2, result;
        
        //int count = 0;
        
        try
        {
            
            
            FileInputStream file = new FileInputStream(filename);
            Scanner scan = new Scanner (file);
            File outputFile = new File("multOutput.txt"); //Creates the output file
            
            FileWriter fWriter = new FileWriter(outputFile);
            BufferedWriter buffWriter = new BufferedWriter(fWriter);
            
            
            while(scan.hasNextLine())
            {
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                result = num1 * num2;
                
                //Write to file
                
                buffWriter.write(result + "\n");
            }
            
            buffWriter.close();
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        
    }

}