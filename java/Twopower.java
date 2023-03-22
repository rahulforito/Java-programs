import java.util.Scanner;

public class Twopower {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int newnumber = n & a;
        if(newnumber == 0){
            System.out.println("number is power of 2");
        }
            else{
                System.out.println("number is not the power of 2");
            }

    }
}
