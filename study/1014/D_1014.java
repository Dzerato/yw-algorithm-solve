import java.util.Scanner;

public class Q3 {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  int i = scanner.nextInt();
  
  i = 1000 - i;
  
  int[] mArray = {500, 100, 50, 10, 5, 1};
  scanner.close();
  
  int n = 0;
  
  for(int m : mArray){
   int q = i / m;
   
   if(q == 0){
    continue;
   }
   
   i = i % m;
   n = n + q;
  }
  System.out.println(n);
 }
}
