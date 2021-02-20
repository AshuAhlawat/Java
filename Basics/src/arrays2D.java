public class arrays2D {
//Identify the smallest number in a 2D array
    public static void main(String args[]){

    int array[][] = {{34,23,39,26,49},{92,89,78,21,24}, {50,60,55,67,70},{62,65,70,70,81},{72,66,77,80,69}}; 
    
		int min=array[0][0];
		
		for (int i=0; i<array.length; i++){
		    for (int j=0; j<array[i].length; j++){
		        if (array[i][j] < min){
		            min = array[i][j];
		        }
		    }
		}
		
		System.out.print("The smallest number in the given array is " + min);
	}
}
