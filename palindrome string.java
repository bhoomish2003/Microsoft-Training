import java.util.*;
class Main {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();int count=0;
      int start=0,end=str.length()-1;
       while(start<end){
         if(str.charAt(start)!=str.charAt(end)){
           count=1;break;
         } start++;end--;  
       }
      if(count==0) 
        System.out.println("It is a palindrome");
      else  System.out.println("Not a palindrome");
    
  }
}