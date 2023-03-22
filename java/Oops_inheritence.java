class Account {
    public final String Printinfo = null;
    public String name;
    protected String email;
    private String password;
    public void setPassword(String password){
        this.password = password;
    }
    public void getPassword(){
        System.out.println("name :- "+name);
        System.out.println("email :- "+email);
        System.out.println("password :- "+password);
    }
}

public class Oops_inheritence{
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "happy";
        a1.email = "happy@gmail.com";
        a1.setPassword("1234");
        a1.getPassword();
    }
}
