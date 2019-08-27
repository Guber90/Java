//This class counts how many characters are there in the line
import java.io.*;
import java.lang.Exception;
public class FileCounter {
    public static void main(String a[]){

        String strLine = "";
        try(BufferedReader br = new BufferedReader( new FileReader("./test.txt")); ) {
	    int i=0;
            while( (strLine = br.readLine()) != null){ //While there are lines left go on
                i++;
                System.out.printf("Line " + i + " has :\t"+strLine.length() + "\tcharacters.\n"); //Write out how many characters are in the line
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");//If there is no file write out message
        } catch (IOException e) {
            System.err.println("Unable to read the file.");//If it is not posible to open file write out message
        }
     }
}
