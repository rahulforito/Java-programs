import java.util.*;
public class recursion {
    public static void printFibo(int n,int a,int b){
        if(n==0){
           return;
        }
       System.out.print(a +" ");
       printFibo(n-1,b,a+b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printFibo(n,0,1);
    }
}