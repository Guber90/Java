//Return an array that contains exactly the same chars as the given array, but rearranged so that every A is immediately followed by a B.
// Do not move the A’s, but every other char may move. The array contains the same number of A’s and B’s, and every A has a char after it that is not an A.


public class SwitchIt{
    
    public static char[] moveIt(char [] array){
	int indexB=-1;
	char temp=' ';
	for(int i=0;i<array.length;i++){
	    if(array[i]=='A'){
		for(int j=0;j<array.length;j++){
		    if(array[j]=='B'){
			if(j==0){
			    indexB=j;
			    break;
			}
			else if(array[j-1]!='A'){
			    indexB=j;
			    break;
			}
		    }
		}
		if(indexB!=-1){
		    temp=array[i+1]; 
		}
		array[i+1]='B';
		array[indexB]=temp;

	    }
	}
	return array;
    }

    public static void main(String [] args){
	char [] array={'C','A','C','B','B','A','C'};
	System.out.println(moveIt(array));
    }


}
