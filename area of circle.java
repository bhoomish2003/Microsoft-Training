import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius of circle :");
    double r=sc.nextDouble();
    double area = Math.PI * r*r;
    System.out.println("area of circle :" +area); 
  }
}