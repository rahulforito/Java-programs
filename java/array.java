import java.util.*;

public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int number[] = new int[size];
        for(int i=0;i<size;i++){
           number[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        for(int i=0;i<number.length;i++){
            if(find == number[i]){
            System.out.print("number found on the position " + i);
            }
            
        }
    }
}
