public class JPA05{
    public static void main(String[] argv) {
     String[] data = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
     System.out.print("反轉陣列資料之前: ");
     for(int i=0;i<data.length;i++){
      System.out.printf("%s ",data[i]);
     }
     System.out.printf("%n");
     reverse(data);
     System.out.print("反轉陣列資料之後: ");
     for(int i=0;i<data.length;i++){
      System.out.printf("%s ",data[i]);
     }
    }
    public static void reverse(String data[]) {
     String t;
     for(int i=0;i<data.length/2;i++){
      t=data[i];
      data[i]=data[data.length-i-1];
      data[data.length-i-1]=t;
     }
    }
   }
