import java.util.*;

public class report {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int input;
        do{
            int marks = sc.nextInt();
            
            if(marks >= 90){
                System.out.println("This is excellent");
            }
            else if(89 >= marks && marks>= 59){
                System.out.println("this is also good");
            }
            else{
                System.out.println("do what do you want to do marks doesn't matters.");
            }    

            System.out.println("enter input 1 for entering more values 0 for teke rest.");
            input = sc.nextInt();
        }while (input == 1);
        
    }
}
