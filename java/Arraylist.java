import java.util.Scanner;

import javax.lang.model.type.ArrayType;

import java.util.ArrayList;
import java.util.Collections;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
    ;
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(6);

        System.out.println(list);
        list.add(7);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(3);
        System.out.println(list);
        list.add(3, 6);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(Collections.binarySearch(list, 11));
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}