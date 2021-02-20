import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
                    
        int i;
        for (i=2000;i<=3000;i++) {
            if ((i%8==0) && (i%6!=0)) {
            System.out.print(i + "\n");
            }
        }

        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        int sum = 0;
        for (i=0;i<=number;i++) {
            sum += i;
        }
        System.out.print(sum);
        
        int n=input.nextInt();
        for(i=n; i>-1;i--){
            System.out.println(i);
        }

        input.close();
    }
}