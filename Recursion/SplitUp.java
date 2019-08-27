//Given a string, compute recursively a new string where all the chars are now separated by a "".

public class SplitUp{
    
	public static String startItUp(String s, int index){
		if(index>s.length()-1){
			return s;
		}
		s=s.substring(0,index)+ " " + s.substring(index);
		return startItUp(s,index+2);

	}

	public static void main(String [] args){
		System.out.println(startItUp("armin",0));
	}

}
