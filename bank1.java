package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getpassword(){
                   //getter
        return this.password;
    }
    public void setpassword(String pass){       //setter
       this.password = pass;
    }
}

public class bank1 {
    public static void main(String args[]) {
        Account acc = new Account();
        acc.name = "Ansh singh";
        acc.email = "sanjayanshsingh25@gmail.com";
        acc.setpassword ("asbs");
        System.out.println(acc.getpassword());



        
    }
    
}
