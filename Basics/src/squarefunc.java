import java.util.Scanner;

class squarefunc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Enter the numbers in the input console
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
        System.out.print(squareOfSum(number1, number2));

        scan.close();
	}
	
	public static int squareOfSum(int x ,int y ){
	    int z = (x+y)*(x+y);
	    return z;
	}
}