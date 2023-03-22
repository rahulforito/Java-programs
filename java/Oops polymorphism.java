class Student {
    int standard;
    String sec;

public void printInfo(int standard){
    System.out.println(standard);
}
public void printInfo(String sec){
    System.out.println(sec);
}
public void printInfo(int standard , String sec){
    System.out.println(standard + " " + sec);
}
}
public class Oopspolymorphism{
public static void main(String[] args) {
    
    Student s1 = new Student();
    s1.standard = 11;
    s1.sec = "c";
    s1.printInfo(s1.standard, s1.sec);
}
}
