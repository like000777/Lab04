import java.util.*;
public class JPA01{
 static Scanner keyboard = new Scanner(System.in);
 public static void main(String args[]) {
  int count[]=new int[10],n=0,sum=0;
  System.out.println("請輸入10個整數:");
  for (int i=0;i<10;i++){
   System.out.printf("第%d個整數:",i+1);
   count[i]=keyboard.nextInt();
  }
  for (int i=0;i<10;i++){
   if (count[i]>60){
    sum+=count[i];
    n++;
   }
  }
  System.out.printf("陣列中大於60的有" + n + "個\n總合為" + sum + "\n平均值為%.6f",(sum / (double)n));
 }
}
