import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class FileUpdate
{
    public static void main(String[] args) {
        try
        {
            FileWriter FileWrite = new FileWriter("E:\\study notes\\file handling\\sample.txt");
            FileWrite.write("Welcome to all");
            FileWrite.write("Java is high level  programming language.");
            FileWrite.write("Java is not 100% oops Concept.");
            FileWrite.close();
            System.out.println("File Write Successfully..!");
        }
        catch (IOException e)
        {
            System.out.println("An error Occurred");
            e.printStackTrace();
        }
    }
}
