import java.util.*;

public class prime{
    public static void calcPrime(int a){
        int count = 0;
        for(int i=2;i<=a;i++){
            if(a % i == 0){
                count = count + 1;
            }
            
        }
            if(count == 1){
                System.out.println("number is prime");
            }
            else{
                System.out.println("number is not prime");
            }
        
    
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calcPrime(n);
    }
}