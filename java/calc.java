import java.util.*;

public class calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator : ");
        sc.nextLine() ;
        String operator = sc.nextLine() ;
        
        int c = 0;
        if(operator.equals("add")){
            c = a + b;
            System.out.println("Addition of two numbers is :" + c);
        }
        else if(operator.equals("sub")){
            c = a - b;
            System.out.println("Substraction of two numbers is :" + c);
        }
        else if(operator.equals("mul")){
            c = a * b;
            System.out.println("Multiplication of two numbers is :" + c);
        }
        else if(operator.equals("div")){
            c = a / b;
            System.out.println("Division of two numbers is :" + c);
        }
        else if(operator.equals("rem")){
            c = a % b;
            System.out.println("Modulo of two numbers is :" + c);
        }
        else{
            System.out.println("bosdiwale ho ka kuch bhi likh dete ho");

        }
    }
}
