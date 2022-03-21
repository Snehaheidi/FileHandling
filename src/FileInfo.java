import java.io.File;
import java.io.IOException;

public class FileInfo
{
  public static void main(String args[])
  {
      try
      {
          //File fileCreate = new File("E:\\study notes\\file handling\\");
          File FileCreate = new File("E:\\study notes\\file handling\\sample.txt");
          //if(!FileCreate.exists())
          if(FileCreate.createNewFile())
          {
              //File FileCreate = new File("E:\\study notes\\file handling\\sample.txt");
              System.out.println("File Successfully created : "+FileCreate.getName());
          }
          else
          {
              System.out.println("File is already exists..");
          }
      }
      catch (IOException e)
      {
          System.out.println("An error Occurred");
          e.printStackTrace();
      }
  }
}

