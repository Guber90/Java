import java.io.*;
// The task is to write a program that opens an existing test file and adds a new line at the end
// with some text and then saves the file. The updated file should contain the added text next time you open or read it again!


public class AddLine{
    
    public static void main(String[] args){
	String fileName="./test.txt"; //Location of file
	try(FileWriter fw=new FileWriter(fileName,true)){ // Try to open file
	    fw.write("Reading exercise\n");	    
	    fw.close(); //Save changes
	}
	catch(Exception e){
	    e.printStackTrace();
	}

    }

}
