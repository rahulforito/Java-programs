import java.util.Scanner;
public class onesCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt(); 
        while(n!=0){
           n = n & n-1;
           count++;
        }
            System.out.println(count);
    }
}