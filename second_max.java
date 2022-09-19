import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=-1,sec_max=-1;
    System.out.println("Enter the elements in array:");
    for(int i=0;i<n;i++)
      {
        int ele=sc.nextInt();
        if(max<ele)
        {
          sec_max=max;
          max=ele;
        }
        else if(sec_max<ele)
        {
          sec_max=ele;
        }
      }
    System.out.println("Second maximum element "+sec_max);
  }
}