//We assume that a cluster in an array is a series of 2 or more adjacent elements of the same value.
//Return the number of clumps in the given array. Overload the method so that it supports all numeric datatypes and chars.

public class NummerOfClusters{
    
    public static int nummerOfClusters(int [] array){
	int prev=array[0];
	int beginSelection=array[0];
	int numberOfElements=0;

	for(int i=1;i<array.length;i++){
	    if(prev==array[i] && array[i]!=beginSelection){
		beginSelection=array[i];
		numberOfElements++;
	    }
	    else if(prev==array[i] && array[i]==beginSelection && i==1){
		numberOfElements++;
	    }
	    prev=array[i];
	}
	return numberOfElements;
    }

    public static int nummerOfClusters(double [] array){
	double prev=array[0];
	double beginSelection=array[0];
	int numberOfElements=0;

	for(int i=1;i<array.length;i++){
	    if(prev==array[i] && array[i]!=beginSelection){
		beginSelection=array[i];
		numberOfElements++;
	    }
	    else if(prev==array[i] && array[i]==beginSelection && i==1){
		numberOfElements++;
	    }
	    prev=array[i];
	}
	return numberOfElements;
    }

    public static int nummerOfClusters(char [] array){
	char prev=array[0];
	char beginSelection=array[0];
	int numberOfElements=0;

	for(int i=1;i<array.length;i++){
	    if(prev==array[i] && array[i]!=beginSelection){
		beginSelection=array[i];
		numberOfElements++;
	    }
	    else if(prev==array[i] && array[i]==beginSelection && i==1){
		numberOfElements++;
	    }
	    prev=array[i];
	}
	return numberOfElements;
    }


    public static void main(String [] args){
	int [] test={'a','a','a','v','b','b'};
	System.out.println(nummerOfClusters(test));
    }

}
