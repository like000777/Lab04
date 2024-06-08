import java.util.*;
public class JPA02{
 public static Scanner keyboard = new Scanner(System.in);
 public static void main(String args[]) {
  int n;
  System.out.print("請輸入學生人數：");
  n = keyboard.nextInt();
  float sum=0,count[]=new float[n];
  for(int i=0;i<n;i++){
   System.out.printf("第%d個學生的成績:",i+1);
   count[i]=keyboard.nextFloat();
   sum+=count[i];
  }
  System.out.printf("人數：%d%n總分:%.2f%n平均:%f%n",n,sum,sum/n);
 }
}
