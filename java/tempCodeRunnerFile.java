/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    for(int i=0;i<a;i++){
            String str = sc.nextLine();
            int count = 0;
            int b=0;
            char mainChar = str.charAt(b);
            for(int j=0;j<str.length()-1;j++){
                char currChar = str.charAt(j);
                if(currChar == mainChar){
                    count++;
                }
                b++;
            }
            if(count%2 != 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}
