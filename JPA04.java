public class JPA04 {
    public static void main(String[] args) {
        int[] n = new int[10];
        n[0]=0;
        n[1]=1;
        for(int a=2;a<10;a++)
            n[a]=n[a-1]+n[a-2];
        for(int a=0;a<10;a++)
            System.out.println(n[a]);
    }
}
