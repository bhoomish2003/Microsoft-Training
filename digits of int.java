import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n>0){
      System.out.println("Digit :"+n%10);
      n/=10;
    }
  }
}