import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("swaping a nums a :"+ a +" b :"+b);
  }
}