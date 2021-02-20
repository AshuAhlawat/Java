import java.util.Scanner;

public class nestedloops1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter No of lines : ");
        int num = input.nextInt();

        System.out.println();
        for(int i=0; i<num; i++){

            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        
        int i, j;
        for(i=0; i<num; i++)
        {
            for(j=num-i; j>=0; j--)
            {
                System.out.print(" ");
            }

            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        int number = 1;
        for(i = 1; i <= num; i++) {
     
            for(j = 1; j <= i; j++) {
                System.out.print(number + " ");
                ++number;
            }
     
            System.out.println();
        }

        input.close();
    }
}