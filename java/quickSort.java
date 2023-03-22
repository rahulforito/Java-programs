public class quickSort {
    public static void Quicksort(int arr[] , int first , int last){
        if(first < last){
            int pi = Partition(arr , first , last);
            Quicksort(arr, first, pi-1);
            Quicksort(arr, pi+1, last);

        }
    }
    public static int Partition(int arr[] , int first , int last){
        int pivot = arr[last];
        int i = first-1;
        for(int j=first; j<last ;j++){
            if(arr[j] < pivot)
            {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[last];
        arr[last] = temp;
        return i;

    }
    public static void main(String args[]){
        int arr[] = {9,4,5,1,3,7};
        int n = arr.length;
        Quicksort(arr , 0 , n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
