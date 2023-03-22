import java.util.*;

public class Strbuilder {
    public static void main(String args[]){
    StringBuilder sb = new StringBuilder("rahul");
    int c = sb.length()/2;
    for(int i=0;i<c;i++){
        int first = i;
        int last = sb.length() - 1 - i;
        
        char firstString = sb.charAt(first);
        char lastString = sb.charAt(last);

        sb.setCharAt(first,lastString);
        sb.setCharAt(last,firstString);
    }
    System.out.println(sb);
}

}
