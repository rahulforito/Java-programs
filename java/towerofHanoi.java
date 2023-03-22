public class towerofHanoi {
    public static void towerOfHanoi(int n, String source, String helper, String dest){
        if(n==1){
            System.out.println(" Transfered disk "+ n + " from "+ source + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, source, dest, helper);

        System.out.println(" Transfered disk " + n + " from " + source + " to " + helper);

        towerOfHanoi(n-1, helper, source, dest);

    }
    public static void main(String args[]){
        int n=3;
        towerOfHanoi(n, "A" , "B", "C");
    }
}
