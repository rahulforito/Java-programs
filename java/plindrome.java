import java.util.Scanner;
class plindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int c=0;
        a = sc.nextInt();
        int temp=0;
        temp = a;
        while(temp!=0)
        {
            b = temp%10;
            c = c*10+b;
            temp = temp/10;
        }
        if(a==c)
        {
            System.out.println("number is palindrome ");
        }
            else     
        {
            System.out.println("number is not palindrome ");
        }
    }
}