import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FileReader
{
    public static void main(String args[])
    {
        try
        {
            File fileReader = new File("E:\\study notes\\file handling\\sample.txt");
            Scanner fileRead = new Scanner(fileReader);
            while (fileRead.hasNextLine())
            {
                String Data = fileRead.nextLine();
                System.out.println(Data);
            }
            fileRead.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
}
