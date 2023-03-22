import java.util.*;

public class circumference {
    public static double calcCircumference(int r){
        double c = 3.14*2*r ;
        System.out.println("the circumference of the circle is :" + c);
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        calcCircumference(a);
    }
}
