public class Trii{
    protected int multiplier(int data){
        return data*5;
    }
}
class Derived extends Trii{
    private static int data;
    public Derived(){
        data = 25;
    }
}
public static void main(String[] args) {
    Trii temp = new Derived();
    System.out.println(temp.multiplier(data));
}
