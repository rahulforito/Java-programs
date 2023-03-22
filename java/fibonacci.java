import java.util.*;

public class fibonacci {
    public static int calcFibo(int d){
        int a=0,b=1;
        System.out.print(a + " ");
        System.out.print(b);
        int c;
        for (int i=1;i<=d;i++){
            c=a+b;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
        
        return d;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        calcFibo(a);
    }
}
