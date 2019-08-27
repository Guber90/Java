//Given a string, compute recursively a new string where all the ‘z’ chars have been removed.

public class NoLetterZ{
    
	public static String noZeeS(String s){
		int index=s.indexOf("z");

		if(index==-1){
			return s;
		}
		return noZeeS(s.substring(0,index) + s.substring(index+1));
	}

	public static void main(String [] args){
		System.out.println(noZeeS("Azrzmzizn"));
	}

}
