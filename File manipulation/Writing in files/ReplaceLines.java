//Replace lines that are before numberOfLines, and append those after numberOfLines in replaceText
//numberOfLines is given by user
import java.io.*;
import java.util.Scanner;

public class ReplaceLines{
    
	public static void main(String [] args){
		String fileName="./ReadLinesSample.txt";
		String replaceText="";
		int numberOfLines;
		//Number of lines can be given as parameter to program or entered while program is executing
		if(args.length>0){
			numberOfLines=Integer.parseInt(args[0]);
		}
		else{
			Scanner inn=new Scanner(System.in);
			System.out.print("Enter number of lines: ");
			numberOfLines=inn.nextInt();
		}
		//We are going trough whole file, replacing lines that are before numberOfLines, and appending those after numberOfLines in replaceText
		try(LineNumberReader numberOfLinesReader = new LineNumberReader(new FileReader(fileName))){
			String line = numberOfLinesReader.readLine();
			int i=1;
			while(line!=null) {
				if(numberOfLinesReader.getLineNumber() < = numberOfLines){
					replaceText+="New input " + i + "\n";
				}
				else{
					replaceText+=line + "\n";
				}
				line = numberOfLinesReader.readLine();
				i++;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//Write new values in file
		try(FileWriter fw=new FileWriter(fileName,false)){
			fw.write(replaceText);
			fw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}


	}

}
