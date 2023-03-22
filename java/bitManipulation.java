import java.util.Scanner;

public class bitManipulation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oper = sc.nextInt();
        int pos = 1;
        int bitMass = 1 << pos;
        
        if(oper == 0){
        int newbitMass = ~bitMass;
        int newnumber = newbitMass & n;
        System.out.println(newnumber);
        }else{
            int newnumber = bitMass | n;
            System.out.println(newnumber);
        }
    }
}
