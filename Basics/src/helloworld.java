import java.util.*;
class helloworld {
  public static void main(String[] args) {

  String[] names=new String[4];
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<4;i++){
    names[i]=sc.nextLine();
  }
  sc.close();

  System.out.println(names[0]+" "+names[2]);
  System.out.println(names[1]+" "+names[3]);

  }

}

