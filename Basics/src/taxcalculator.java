import java.util.Scanner;

public class taxcalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();
        
        double tax = 0.0;
        
        if (income>250000){
            if (age<60){
                if(income>1000000){
                    tax = (income - 1000000)*0.3 + 500000*0.2 + 250000*0.1;
                }
                else if ((income > 500000) && (income <=1000000)){
                    tax =(income - 500000)*0.2 + 250000*0.1;
                }
                else if ((income > 250000)&&(income <=500000)){
                    tax = (income - 250000)*0.1;
                }
            }
            else if (age<80){
                if(income>1000000){
                    tax = (income - 1000000)*0.3 + 500000*0.2 + 300000*0.1;
                }
                else if ((income > 500000) && (income <=1000000)){
                    tax =(income - 500000)*0.2 + 300000*0.1;
                }
                else if ((income > 300000)&&(income <=500000)){
                    tax = (income - 300000)*0.1;
                }
            }
            else{
                if(income>1000000){
                    tax = (income - 1000000)*0.3 + 500000*0.2 + 250000*0.1;
                }
                else if ((income > 500000) && (income <=1000000)){
                    tax =(income - 500000)*0.2 + 250000*0.1;
                }
            }
            
        }
        
        System.out.print(tax);
        scan.close();
    }
}