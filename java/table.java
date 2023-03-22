import java.util.*;

public class table {
    public static void calcTable(int n){
        for(int i=1;i<=10;i++){
            int t;
            t = n * i;
            System.out.println(n + "*" + i + "=" + t) ;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a;
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        calcTable(a);
    }
    
}
