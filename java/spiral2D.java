import java.util.*;

public class spiral2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and cols :-");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] number = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                number[i][j]=sc.nextInt();
            }
        }
        int minC = 0;
        int minR = 0;
        int maxC = n-1;
        int maxR = m-1;

        while(minC<maxC && minR<maxR){
            for(int i=minC;i<=maxC;i++){
                System.out.print(number[minR][i] + " ");
            }
            minR++;
            for(int i=minR;i<=maxR;i++){
                System.out.print(number[maxC][i] + " ");
            }
            maxC--;
            for(int i=maxC;i<=minC;i--){
                System.out.print(number[maxR][i] + " ");
            }
            maxR--;
            for(int i=maxR;i<=minR;i--){
                System.out.print(number[maxC][i] + " ");
            }
            maxC++;
            System.out.println();
        }
    }
}
