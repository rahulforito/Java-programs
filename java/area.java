import java.util.*;

public class area {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius of circle : ");
        int rad;
        rad = sc.nextInt();
        double A;
        A = (3.14 * rad * rad);
        System.out.print("Area is : ");
        System.out.print( A );   
    }
}
