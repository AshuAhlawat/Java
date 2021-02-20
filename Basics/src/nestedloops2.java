import java.util.Scanner;

public class nestedloops2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter No of lines : ");
        int num = input.nextInt();
        int value = 0;

        System.out.println();
        for (int i = 0; i < num;i++){
            for (int j=0; j<=i; j++){
                value++;
                System.out.print(value+" ");
            }
            System.out.println();
        }

        input.close();
    }
}