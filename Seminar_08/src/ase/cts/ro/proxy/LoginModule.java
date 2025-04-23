package ase.cts.ro.proxy;

public class LoginModule implements Loginable {
    String pass;

    public LoginModule(String pass) {
        this.pass = pass;
    }

    public boolean login(String password){
        if(this.pass.equals(password)){
            System.out.println("Logged in with " + password);
            return true;
        }
        return false;
    }
}
