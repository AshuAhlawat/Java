public class variables {
    public static void main(String[] args){

        int x = 64;
        double y = 5.5;
        
        System.out.println( x + y + 10 );
        //79.5
        System.out.println( "" + x + y + 10 );
        //79.5
        System.out.println( x + "" + y + 10 );
        //6415.5
        System.out.println( x + y + "" + 10 );
        //69.510
        System.out.println( x + y + 10 + "" );
        //79.5
    }
}
