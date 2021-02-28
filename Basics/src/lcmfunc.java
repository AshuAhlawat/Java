import java.util.Scanner;


public class lcmfunc {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
		int number2 = input.nextInt();
        input.close();

        System.out.println(lcm(number1, number2));

        
	}

    public static int lcm(int x, int y){

        int lcmnum;
        if (x>y){
            lcmnum = x;
        }
        else if (y>x){
            lcmnum = y;
        }
        else {
            return x;
        }
        while(true){
            if( lcmnum % x == 0 && lcmnum % y == 0 ) {
                return lcmnum;
            }
            ++lcmnum;
            
        }
        
    }

}
