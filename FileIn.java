import java.nio.file.*;
import java.io.*;

public class FileIn
{
    public static void main(String[] args)
    {
        Path file = Paths.get("/jupyter/work/oop/week8/data.txt");

        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            
            String s = reader.readLine();
            while(s != null)
            {
                System.out.println(s);
                s = reader.readLine();
            }
            
            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("No such file");
        }
    }
}
