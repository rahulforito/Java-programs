public class countpathMaze {
    public static int Findpath(int n , int m , int i , int j){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downward
        int downpath = Findpath(n, m, i+1, j);

        // move right
        int rightpath = Findpath(n, m, i, j+1);

        return downpath+rightpath;
    }

    public static void main(String[] args) {
        int n=3 ,m=4;
        System.out.println(Findpath(n, m, 0, 0));
    }
}
