import java.util.*;

public class average {
    public static float clacAverage(float a,float b,float c){
        float avg;
        avg = (a+b+c)/3;
        System.out.println("the average is :" + avg);
        return avg;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of three numbers: ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        clacAverage(a, b, c);
    }
}
