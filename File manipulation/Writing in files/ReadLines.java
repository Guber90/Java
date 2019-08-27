//Write a program that read in a file but only the first n lines.
// N is defined at the start of the program and can be given trough console as parameter

import java.io.*;
import java.util.Scanner;

public class ReadLines{
    public static void main(String [] args){
	int numberOfLines;
	if(args.length>0){//Number of lines can be given as parameter to program or entered while program is executing
	    numberOfLines=Integer.parseInt(args[0]);
	}
	else{
	    Scanner inn=new Scanner(System.in);
	    System.out.print("Enter number of lines: ");
	    numberOfLines=inn.nextInt();
	}
	try(LineNumberReader numberOfLinesReader = new LineNumberReader(new FileReader("./ReadLinesSample.txt"))){

	    String line = numberOfLinesReader.readLine();
	    while(numberOfLinesReader.getLineNumber() <= numberOfLines && line!=null) {//If number of line is writen out to screen or we are at end of file then program is done
		System.out.println(line);
		line = numberOfLinesReader.readLine();
	    }

	}
	catch(Exception e){
		System.out.println("File not found");
	}

    }
}
