import java.util.*;
class Main {
  static double area(int x1,int y1,int x2,int y2,int x3,int y3)
  {
    return Math.abs((x1*(y2-y3) + x2*(y3-y1)+x3*(y1-y2))/2.0);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int x3=sc.nextInt();
    int y3=sc.nextInt();
    double area=area(x1,y1,x2,y2,x3,y3);
    System.out.println("Area of triange :"+area);
    
  }
}