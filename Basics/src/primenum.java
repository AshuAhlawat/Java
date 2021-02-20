public class primenum {
    // Find the largest 4 digit prime number 
    public static void main(String[] args) {
        
        int factor = 0;
		for (int i=9999; i>999; i--) {
		    
			for (int j=2; j<i/2 || factor == 2 ; j++) {
                
                if (i%j==0){
                    factor++;
                }
			}
            if (factor == 0 ){
                System.out.println("The Largest Prime number is "+ i);
                break;
            }
            else{
                factor=0;
            }
			
		}
	}
    
}
