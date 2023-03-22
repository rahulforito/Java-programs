import java.util.Scanner;
public class findInt{
public static int[] bubblesort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
}


    public static int findInt(int arr[] ,int n){
        bubblesort(arr);
        int a = 1;
        for(int i=0;i<n;i++){
            if(arr[i] == a){
                a++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findInt(arr,n));
        
    }
}
