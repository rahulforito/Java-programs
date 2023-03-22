import java.util.*;

public class oddsum {
    public static void oddSum(int s){
        int a=0;
        int i=1;
        while(i<=s){
            System.out.print(i + "+");
        
            i = i+2;
            a++;
            
        } 
        System.out.print( "=" + a*a);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value til u want to sum : ");
        int a = sc.nextInt();
        oddSum(a);
    }
}
