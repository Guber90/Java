//Class that reads file and lists size of it in bytes, kilo bytes and mega bytes
import java.io.File;

public class FileSize {
    public static void main(String[] args)
    {
        File file = new File("./test.txt"); //open the file given a path
        if(file.exists())
        {
            double sizeInb=file.length();
            double sizeInkb=sizeInb/1024;
            double sizeInMb=sizeInkb/1024;
            System.out.println("Size of file in [B] is: " + file.length());
            System.out.println("Size of file in [kB] is: " + sizeInkb);
            System.out.println("Size of file in [MB] is: " + sizeInMb);
        }
        else
            System.out.println("File doesn't exist");
    }
}
