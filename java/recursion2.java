public class recursion2 {
    public static int first = -1;
    public static int last = -1;

    public static void Occurance(String str, int idx,char cr){

        if(idx == str.length()){
            return;
        }
        
        if(str.charAt(idx) == cr){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
      
        Occurance(str, idx+1, cr);
    }
    public static void main(String args[]){
        String str = "bacysagdjaaja";
        char cr = 'a';
        Occurance(str, 0 , cr);
        System.out.println(first);
        System.out.println(last);
    }
}
