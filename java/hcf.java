
import java .util.*;

public class hcf {
    public static int calcHcf(int a, int b){
        int hcf = 0;
    for(int i=1;i<=a || i<=b;i++){
        if(a%i==0 && b%i==0)
        {
            hcf = i;
        }
           }
    System.out.println(hcf);
    return hcf;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calcHcf(a, b);
    }
}
 