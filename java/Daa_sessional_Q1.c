#include<stdio.h>
#include<time.h>       // for clock_t, clock(), CLOCKS_PER_SEC
#include<stdlib.h>
 
// function to swap elements
void swap(int *a, int *b) {
  int t = *a;
  *a = *b;
  *b = t;
}

// function to find the partition position
int partition(int array[], int low, int high) {
 
  int pivot = array[high];
 
  int i = (low - 1);
 
  for (int j = low; j < high; j++) {
    if (array[j] <= pivot) {
      i++;
      swap(&array[i], &array[j]);
    }
  }
 
  // swap the pivot element with the greater element at i
  swap(&array[i + 1], &array[high]);
 
  // return the partition point
  return (i + 1);
}
 
void Quick_sort(int array[], int low, int high) {
  if (low < high) {
 
    int pi = partition(array, low, high);
   
    // recursive call on the left of pivot
    Quick_sort(array, low, pi - 1);
   
    // recursive call on the right of pivot
    Quick_sort(array, pi + 1, high);
  }
}
 
void reverse(int my_array[], int size)
{
    int aux[size];
 
    for (int i = 0; i < size; i++) {
        aux[size - 1 - i] = my_array[i];
    }
 
    for (int i = 0; i < size; i++) {
        my_array[i] = aux[i];
    }
}
 
void print_array(int my_array[], int size){
    for(int i=0;i<size;i++)
    {
        printf("%d ",my_array[i]);
    }
}
 
int main()
{
    int n=9,size,*my_array;
    double cpu_time_used;
    printf("\n\nEnter the number of elements: ");
    scanf("%d",&size);
    my_array=malloc(sizeof(int)*size);
 
    for(int i=0;i<size;i++)
        my_array[i]=rand();
 
    printf("\nChoices:\n1)Display\n2)Apply Quick Sort\n3)Reverse array\n4)Average Case\n5)Best Case\n6)Worst Case\n0)to exit\n");
 
    while(n!=0){
        printf("\n\nEnter your choice: ");
        scanf("%d",&n);
        switch(n){
            case 1:
                print_array(my_array, size);
                break;
 
            case 2:
                Quick_sort(my_array,0,size-1);
                printf("\nSorted Successfully");
                break;
 
            case 3:
                reverse(my_array, size);
                printf("\nReversed Successfully");
                break;
 
            case 4:;
                long double time_spent = 0.0;
                clock_t begin = clock();
                Quick_sort(my_array,0,size-1);
                clock_t end = clock();
                time_spent += (double)(end - begin) / CLOCKS_PER_SEC;
                printf("\nThe Average time is %Lf seconds", time_spent);
                break;
 
            case 5:
                Quick_sort(my_array,0,size-1);
                long double time_spent_1 = 0.0;
                clock_t begin_1 = clock();
                Quick_sort(my_array,0,size-1);
                clock_t end_1 = clock();
                time_spent_1 += (double)(end_1 - begin_1) / CLOCKS_PER_SEC;
                printf("\nThe Best case time is %Lf seconds", time_spent_1);
                break;
 
            case 6:
                Quick_sort(my_array,0,size-1);
                reverse(my_array, size);
                long double time_spent_2 = 0.0;
                clock_t begin_2 = clock();
                Quick_sort(my_array,0,size-1);
                clock_t end_2 = clock();
                time_spent_2 += (double)(end_2 - begin_2) / CLOCKS_PER_SEC;
                printf("\nThe Worst case time is %Lf seconds", time_spent_2);
                break;
 
            default:
                printf("QUIT\n");
                break;
        }
    }
    return 0;
}
