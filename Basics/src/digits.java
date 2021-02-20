import java.util.Scanner;
public class digits {
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int digits = 0;
        while (n>0){
            n = n/10;
            digits++;
        }
        System.out.println(digits);
        input.close();
     }
}
