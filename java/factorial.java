import java.util.Scanner;

public class factorial {
    public static int calcFactorial(int n){
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact = fact*i;        
            
        }
       
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = calcFactorial(a);
        System.out.println("the factorial of the number is : " + fact );
    }
}
