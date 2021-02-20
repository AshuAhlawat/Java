import java.util.Scanner;

public class powerlimit {
    //Output the greatest power of 2 which is lesser than the given input
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the number
        int number = scan.nextInt();  
        int result = 1; 
        if(number >= 2) {
         
        while (result<number) {
          result *= 2;
        } 
        
        System.out.print(result/2);
        
        } else {
          System.out.print("Please enter an integer >= 2");   
        }
        scan.close();
    }
}
