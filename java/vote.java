import java.util.*;
public class vote {
    public static void calcEligible(int a){
        if (a > 18)
        System.out.println("you are eligible");
        else{
            System.out.println("not eligible");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age :");
        int s = sc.nextInt();
        calcEligible(s);
    }
}
