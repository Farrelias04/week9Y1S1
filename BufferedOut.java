import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class BufferedOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Path file = Paths.get("/jupyter/work/oop/week8/data.txt");

        try
        {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            
            String s = "";
            while(!s.equals("QUIT"))
            {
                System.out.println("Enter a string:");
                s = input.nextLine();
                writer.write(s);
                writer.newLine();
            }
            
            writer.flush();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("No such file");
        }
    }
}