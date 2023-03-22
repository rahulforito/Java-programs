import java.util.*;

public class counting {
    public static void calcCount(int a){
        int q = 0,f = 0,g = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=a;i++){
            int n = sc.nextInt();
        
        if (n>0){
           q = q+1;
        }
        else if(n==0){
            f = f+1;
        }
        else{
            g = g+1;
        }
    }
    System.out.println(q + "positive numbers   " + f + "zeroes   " + g + "negative numbers   ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter : ");
        int d = sc.nextInt();
        calcCount(d);

    }
    
}
