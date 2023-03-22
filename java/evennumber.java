import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class evennumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("for even press 1, press 2 for odd");
        int n = sc.nextInt();
        if(n == 1)
    {
        System.out.println("enter largest number till u want to write");
        int m = sc.nextInt();
        for (int i=0;i<=m;i++)
        if(i%2==0)
        {
            System.out.println(i);
        }
    }
    else if(n == 2)
    {
        System.out.println("enter largest number till u want to write");
        int m = sc.nextInt();
        for (int i=0;i<m;i++)
        if(i%2!=0)
        {
            System.out.println(i);
        }

    }
    else 
    {
        System.out.println("bhag yha se mc");
    }
        
    }
   
    
}
