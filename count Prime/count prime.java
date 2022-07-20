import java.util.*;
public class MyClass{
  static boolean checkPrime(int num){
  if(num <= 3) return true;
   
    for(int i = 2; i<num; i++){
      if(num % i == 0) return false;
    }
    return true;
   }
   static int countPrime(int s , int e){
     int count = 0;
     for(int i = s; i<= e; i++){
       if(checkPrime(i)) count++;
     }
     return count;
   }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    System.out.println(countPrime(start,end));
  }
}
