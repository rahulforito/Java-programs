import java.util.*;

public class greatest {
    public static void findGreatest(int a , int b){
        if (a>b){
            System.out.println(a + "is larger amoung these numbers");
        }
        else{
            System.out.println(b + "is larger");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the two numbers : ");
        int v = sc.nextInt();
        int w = sc.nextInt();
        findGreatest(v, w);

    }
    
}
