public class _test {
    public static void main(String args[]){
        int number = 8;
        int total = 0;
        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
               System.out.print(j + " ");
               total++;
            }
            System.out.println();
          }
          System.out.println(total);
    }
}
