public class stringBuilders {
    public static void main(String args[]){
    StringBuilder sb = new StringBuilder("rahul");
    for(int i=0;i<sb.length()/2;i++){
        int first = i;
        int last = sb.length()-1-i;

        char firstString = sb.charAt(first);
        char lastString = sb.charAt(last);

        sb.setCharAt(firstString,lastString);
        sb.setCharAt(lastString,firstString);
    }
    System.out.println(sb);
}

}
