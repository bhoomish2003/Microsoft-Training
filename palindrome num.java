import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),rev=0,n1=n;
    while(n!=0){
        rev=rev*10+(n%10);n/=10;
    }if(n1==rev) System.out.print("Yes");
    else System.out.print("NO");
  }
}