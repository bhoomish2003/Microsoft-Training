import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int hash[]=new int[26];
    for(int i=0;i<s.length();i++)
      {
        hash[s.charAt(i)-97]++;
      }
    for(int i=0;i<26;i++)
      {
        if(hash[i]!=0)
        {
          System.out.println("character "+(char)(97+i)+" : "+hash[i]);
        }
      }
  }
}