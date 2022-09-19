import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),mean=0,median=0,mode=0;
    int arr[]=new int[n];
    int hash[]=new int[10000];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
       mean+=arr[i];
       hash[arr[i]]++;
    }
    int max=0;
    for(int i=0;i<10000;i++)if(max<hash[i]) max=hash[i];
    System.out.println("Mean "+mean/n);
    System.out.println("Median "+arr[n/2]);
    System.out.println("Mode :");
     for(int i=0;i<10000;i++)if(max==hash[i])
        System.out.println(i);
       
    
      
  }
}